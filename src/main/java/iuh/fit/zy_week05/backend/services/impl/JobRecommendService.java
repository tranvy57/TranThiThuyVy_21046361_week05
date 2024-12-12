package iuh.fit.zy_week05.backend.services.impl;

import iuh.fit.zy_week05.backend.dtos.JobRecommendResponse;
import iuh.fit.zy_week05.backend.entities.*;
import iuh.fit.zy_week05.backend.repositories.CandidateRepository;
import iuh.fit.zy_week05.backend.repositories.CandidateSkillRepository;
import iuh.fit.zy_week05.backend.repositories.JobRepository;
import iuh.fit.zy_week05.backend.repositories.JobSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobRecommendService {
    @Autowired
    private CandidateSkillRepository candidateSkillRepository;

    @Autowired
    private JobSkillRepository jobSkillRepository;

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    CandidateRepository candidateRepository;

    // Phương thức gợi ý công việc
    public List<JobRecommendResponse> recommendJobs(String email) {

        Candidate candidate = candidateRepository.findByEmail(email);
        // Lấy kỹ năng của ứng viên
        List<CandidateSkill> candidateSkillList = candidate.getCandidateSkills();
        List<Skill> candidateSkills = new ArrayList<>();
        for (CandidateSkill candidateSkill : candidateSkillList) {
            candidateSkills.add(candidateSkill.getId().getSkillId());
        }

        // Lấy tất cả các công việc (hoặc bạn có thể filter thêm nếu cần)
        List<Job> jobs = jobRepository.findAll();

        // Danh sách kết quả trả về
        List<JobRecommendResponse> recommendations = new ArrayList<>();

        // Lặp qua tất cả công việc để so sánh kỹ năng
        for (Job job : jobs) {
            // Lấy kỹ năng yêu cầu cho công việc

            List<JobSkill> listJobSkill = job.getJobSkills();
            List<Skill> jobSkills = new ArrayList<>();
            for (JobSkill jobSkill : listJobSkill) {
                jobSkills.add(jobSkill.getId().getSkillId());
            }

            // Các danh sách lưu trữ kỹ năng phù hợp và kỹ năng thiếu
            List<Skill> matchedSkills = new ArrayList<>();
            List<Skill> missedSkills = new ArrayList<>();

            // Phân loại kỹ năng của công việc so với kỹ năng của ứng viên
            for (Skill jobSkill : jobSkills) {
                if (candidateSkills.contains(jobSkill)) {
                    matchedSkills.add(jobSkill);
                } else {
                    missedSkills.add(jobSkill);
                }
            }

            // Nếu có ít nhất một kỹ năng phù hợp, thêm công việc vào danh sách gợi ý
            if (!matchedSkills.isEmpty()) {
                recommendations.add(new JobRecommendResponse(job, matchedSkills, missedSkills));
            }
        }

        return recommendations;  // Trả về danh sách công việc gợi ý
    }
}
