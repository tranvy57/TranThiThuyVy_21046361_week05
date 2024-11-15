package iuh.fit.zy_week05.frontend.controllers;

import iuh.fit.zy_week05.backend.entities.Company;
import iuh.fit.zy_week05.backend.entities.Job;
import iuh.fit.zy_week05.backend.entities.JobSkill;
import iuh.fit.zy_week05.backend.entities.Skill;
import iuh.fit.zy_week05.backend.enums.SkillLevel;
import iuh.fit.zy_week05.backend.ids.JobSkillId;
import iuh.fit.zy_week05.backend.services.CompanyService;
import iuh.fit.zy_week05.backend.services.JobService;
import iuh.fit.zy_week05.backend.services.JobSkillService;
import iuh.fit.zy_week05.backend.services.SkillService;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView showJobByCompany( @RequestParam("page") Optional<Integer> page,
                                      @RequestParam("size") Optional<Integer> size, HttpSession session){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("company/show-jobs-by-company");

        Company company = (Company) session.getAttribute("loggedInUser");
        Long id = company.getId();

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



    @RequestMapping(value = "/createJob")
    public ModelAndView showJobPage(){
        List<Skill> skills = skillService.getAllSkills();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("skills", skills);
        modelAndView.setViewName("company/create-job");
        return modelAndView;
    }


    @RequestMapping(value = "/createJob", method = RequestMethod.POST)
    public ModelAndView createJob(@ModelAttribute Job job, @RequestParam List<Long> skills,        // Danh sách kỹ năng (ID kỹ năng)
                                  @RequestParam List<String> skillLevels, HttpSession session){        // Danh sách cấp độ kỹ năng

//        log.info("Job saved: " + job);
//        log.info("Skills: " + skills);
//        log.info("Skill levels: " + skillLevels);

        Company company = (Company) session.getAttribute("loggedInUser");
        job.setCompany(company);
        Job newJob = jobService.saveJob(job);

        JobSkill jobSkill = new JobSkill();
        JobSkillId jobSkillId = new JobSkillId();
        jobSkillId.setJobId(newJob);

        for (int i = 0; i < skills.size(); i++){
            Skill skill = skillService.getSkillById(skills.get(i));
            jobSkillId.setSkillId(skill);
            jobSkill.setId(jobSkillId);
            jobSkill.setSkillLevel(SkillLevel.valueOf(skillLevels.get(i)));
            jobSkillService.createJobSkill(jobSkill);

        }


        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("redirect:/companies/getListJob");
        return modelAndView;
    }
}
