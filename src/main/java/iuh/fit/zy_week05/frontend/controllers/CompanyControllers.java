package iuh.fit.zy_week05.frontend.controllers;

import iuh.fit.zy_week05.backend.dtos.CandidateRecommendResponse;
import iuh.fit.zy_week05.backend.dtos.JobDetailDto;
import iuh.fit.zy_week05.backend.dtos.JobDto;
import iuh.fit.zy_week05.backend.dtos.ListCandidateRecommendByJob;
import iuh.fit.zy_week05.backend.entities.Company;
import iuh.fit.zy_week05.backend.entities.Job;
import iuh.fit.zy_week05.backend.entities.JobSkill;
import iuh.fit.zy_week05.backend.entities.Skill;
import iuh.fit.zy_week05.backend.enums.SkillLevel;
import iuh.fit.zy_week05.backend.ids.JobSkillId;
import iuh.fit.zy_week05.backend.services.*;
import iuh.fit.zy_week05.backend.services.impl.CandidateRecommendationService;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Slf4j
@Controller
@RequestMapping("/companies")
public class CompanyControllers {
    @Autowired
    CompanyService companyService;
    @Autowired
    JobService jobService;
    @Autowired
    SkillService skillService;
    @Autowired
    JobSkillService jobSkillService;
    @Autowired
    CandidateRecommendationService recommendationService;

    @Autowired
    EmailService emailService;

    @RequestMapping("")
    public ModelAndView companyDetail(@RequestParam("page") Optional<Integer> page,
                                      @RequestParam("size") Optional<Integer> size){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("trangchu");


        int currentPage = page.orElse(1);
        int pageSize = size.orElse(6);
        Page<Job> jobPage = jobService.getAllJobs(currentPage - 1, pageSize);
        modelAndView.addObject("jobPage", jobPage);

        int totalPages = jobPage.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            modelAndView.addObject("pageNumbers", pageNumbers);
        }

        return modelAndView;
    }

    @RequestMapping("/getListJob")
    public ModelAndView showJobByCompany(@RequestParam("page") Optional<Integer> page,
                                         @RequestParam("size") Optional<Integer> size, Principal principal){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("company/show-jobs-by-company");


        Long id = companyService.getCompanyByEmail(principal.getName()).getId();

        int currentPage = page.orElse(1);
        int pageSize = size.orElse(6);
        Page<Job> jobPage = jobService.getJobsByCompanyId(id, currentPage - 1, pageSize);
        modelAndView.addObject("jobPage", jobPage);

        int totalPages = jobPage.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            modelAndView.addObject("pageNumbers", pageNumbers);
        }

        return modelAndView;
    }

    @GetMapping("/getListJob/{jobId}")
    public String getJobDetail(@PathVariable Long jobId, Model model) {
        JobDetailDto jobDetailDto = jobService.getJobDetail(jobId);
        model.addAttribute("jobDetail", jobDetailDto);
        return "job/jobDetail"; //
    }



    @GetMapping("/createJob")
    public ModelAndView createJobPage(Model model) {
        model.addAttribute("job", new JobDto());
        model.addAttribute("skills", skillService.getAllSkills());
        return new ModelAndView("company/create-job");
    }

    @PostMapping("/createJob")
    public ModelAndView createJob(@ModelAttribute JobDto job, Principal principal) {

        // Lấy ID công ty từ email người dùng đăng nhập
        Long companyId = companyService.getCompanyByEmail(principal.getName()).getId();
        job.setCompanyId(companyId);

        // Lưu job và điều hướng đến danh sách công việc
        jobService.saveJob(job);

        return new ModelAndView("redirect:/companies/getListJob");
    }

    @GetMapping("/candidate-recommendations")
    public String getCandidateRecommendationsForCompany(Model model, Principal principal) {
        // Lấy danh sách công việc và ứng viên phù hợp
        Company company = companyService.getCompanyByEmail(principal.getName());
        List<ListCandidateRecommendByJob> jobRecommendations = recommendationService
                .getCandidatesForCompanyJobs(company);

        // Truyền danh sách vào model
        model.addAttribute("jobRecommendations", jobRecommendations);

        return "company/recommendCandidates";  // Giao diện Thymeleaf
    }

    @PostMapping("/send-email")
    public String sendEmail(@RequestParam String candidateEmail, @RequestParam Long jobId, Model model, Principal principal) {
        try {
            // Gửi email mời
            emailService.sendInvitationEmail(candidateEmail, jobId);
            model.addAttribute("successMessage", "Email đã được gửi thành công!");
        } catch (Exception e) {
            model.addAttribute("errorMessage", "Có lỗi khi gửi email.");
        }


        Company company = companyService.getCompanyByEmail(principal.getName());
        List<ListCandidateRecommendByJob> jobRecommendations = recommendationService
                .getCandidatesForCompanyJobs(company);

        // Truyền danh sách vào model
        model.addAttribute("jobRecommendations", jobRecommendations);

        return "company/recommendCandidates";
    }


}
