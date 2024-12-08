package iuh.fit.zy_week05.frontend.controllers;

import iuh.fit.zy_week05.backend.dtos.CreateCandidateSkillRequest;
import iuh.fit.zy_week05.backend.dtos.JobRecommendResponse;
import iuh.fit.zy_week05.backend.entities.Candidate;
import iuh.fit.zy_week05.backend.entities.CandidateSkill;
import iuh.fit.zy_week05.backend.enums.SkillLevel;
import iuh.fit.zy_week05.backend.repositories.SkillRepository;
import iuh.fit.zy_week05.backend.services.CandidateSkillService;
import iuh.fit.zy_week05.backend.services.SkillService;
import iuh.fit.zy_week05.backend.services.impl.CandidateService;
import iuh.fit.zy_week05.backend.services.impl.JobRecommendService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/candidates")
public class CandidateController {

    @Autowired
    private CandidateSkillService candidateSkillService;

    @Autowired
    private CandidateService candidateService;

    @Autowired
    private SkillService skillService;

    @Autowired
    private JobRecommendService jobRecommendationService;

    @GetMapping("/skills")
    public String showWorkExperience( Model model, Principal principal) {
        Candidate candidate = candidateService.getCandidateByEmail(principal.getName());
        List<CandidateSkill> candidateSkills = candidate.getCandidateSkills();
        model.addAttribute("candidateSkills", candidateSkills);
        log.info(candidateSkills.toString());// Lấy tất cả kỹ năng có sẵn
        model.addAttribute("createCandidateSkillRequest", new CreateCandidateSkillRequest());

        model.addAttribute("skills", skillService.getAllSkills());
        model.addAttribute("skillLevels", SkillLevel.values());

        return "candidate/skills";
    }



    @PostMapping("/skills")
    public String addCandidateSkill(@ModelAttribute CreateCandidateSkillRequest request, Model model, Principal principal) {
        Candidate candidate = candidateService.getCandidateByEmail(principal.getName());
        request.setCandidateId(candidate.getId());
        candidateSkillService.addCandidateSkill(request);
//        model.addAttribute("message", "Candidate skill added successfully!");
        List<CandidateSkill> candidateSkills = candidate.getCandidateSkills();
        model.addAttribute("candidateSkills", candidateSkills);
        log.info(candidateSkills.toString());// Lấy tất cả kỹ năng có sẵn
        model.addAttribute("createCandidateSkillRequest", new CreateCandidateSkillRequest());

        model.addAttribute("skills", skillService.getAllSkills());
        model.addAttribute("skillLevels", SkillLevel.values());


        return "redirect:/candidates/skills";  // Redirect to the same page or a success page
    }


    @GetMapping("/recommendJobs")
    public String getJobRecommendations(Model model, Principal principal) {
        // Giả sử principal.getName() trả về tên ứng viên (hoặc email)
        String candidateEmail = principal.getName();

        // Lấy danh sách các công việc gợi ý từ service
        List<JobRecommendResponse> recommendList = jobRecommendationService.recommendJobs(candidateEmail);

        // Truyền danh sách gợi ý vào model để sử dụng trong view
        model.addAttribute("recommendList", recommendList);

        return "candidate/recommendJobs"; // Trả về trang "recommendJobs" trong thư mục "candidate"
    }
}

