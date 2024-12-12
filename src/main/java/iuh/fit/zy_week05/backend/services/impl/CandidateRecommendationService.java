package iuh.fit.zy_week05.backend.services.impl;

import iuh.fit.zy_week05.backend.dtos.CandidateRecommendResponse;
import iuh.fit.zy_week05.backend.dtos.ListCandidateRecommendByJob;
import iuh.fit.zy_week05.backend.entities.*;
import iuh.fit.zy_week05.backend.repositories.CandidateRepository;
import iuh.fit.zy_week05.backend.repositories.CompanyRepository;
import iuh.fit.zy_week05.backend.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CandidateRecommendationService {

    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private SkillRepository skillRepository;
    @Autowired
    private CompanyRepository companyRepository;

    public List<ListCandidateRecommendByJob> getCandidatesForCompanyJobs(Company company) {


        // Lấy tất cả các công việc của công ty
        List<Job> jobs = company.getJob();

        List<ListCandidateRecommendByJob> listCandidateRecommendations = new ArrayList<>();

        // Duyệt qua từng công việc
        for (Job job : jobs) {
            List<CandidateRecommendResponse> candidateRecommendations = new ArrayList<>();

            // Lấy tất cả ứng viên
            List<Candidate> candidates = candidateRepository.findAll();

            for (Candidate candidate : candidates) {
                // Lấy kỹ năng của ứng viên
                List<CandidateSkill> candidateSkills =candidate.getCandidateSkills();

                // Lấy kỹ năng yêu cầu cho công việc
                List<JobSkill> jobSkills = job.getJobSkills();

                // Kiểm tra kỹ năng của ứng viên có phù hợp với công việc không
                List<Skill> matchedSkills = new ArrayList<>();
                List<Skill> missedSkills = new ArrayList<>();

                for (JobSkill jobSkill : jobSkills) {
                    boolean hasSkill = candidateSkills.stream()
                            .anyMatch(cs -> cs.getId().getSkillId().equals(jobSkill.getId().getSkillId()));

                    if (hasSkill) {
                        matchedSkills.add(jobSkill.getId().getSkillId());
                    } else {
                        missedSkills.add(jobSkill.getId().getSkillId());
                    }
                }

                // Nếu có kỹ năng phù hợp thì thêm vào danh sách
                if (!matchedSkills.isEmpty()) {
                    CandidateRecommendResponse response = CandidateRecommendResponse.builder()
                            .candidate(candidate)
                            .matchedSkills(matchedSkills)
                            .missedSkills(missedSkills)
                            .build();
                    candidateRecommendations.add(response);
                }
            }

            // Chỉ thêm công việc nếu có ứng viên phù hợp
            if (!candidateRecommendations.isEmpty()) {
                ListCandidateRecommendByJob jobRecommendations = ListCandidateRecommendByJob.builder()
                        .job(job)
                        .candidateRecommendResponses(candidateRecommendations)
                        .build();
                listCandidateRecommendations.add(jobRecommendations);
            }
        }

        return listCandidateRecommendations;
    }
}
