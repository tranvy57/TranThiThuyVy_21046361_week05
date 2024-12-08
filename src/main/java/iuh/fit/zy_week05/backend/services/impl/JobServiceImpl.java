package iuh.fit.zy_week05.backend.services.impl;

import iuh.fit.zy_week05.backend.dtos.JobDetailDto;
import iuh.fit.zy_week05.backend.dtos.JobDto;
import iuh.fit.zy_week05.backend.entities.Company;
import iuh.fit.zy_week05.backend.entities.Job;
import iuh.fit.zy_week05.backend.entities.JobSkill;
import iuh.fit.zy_week05.backend.entities.Skill;
import iuh.fit.zy_week05.backend.enums.SkillLevel;
import iuh.fit.zy_week05.backend.ids.JobSkillId;
import iuh.fit.zy_week05.backend.repositories.CompanyRepository;
import iuh.fit.zy_week05.backend.repositories.JobRepository;
import iuh.fit.zy_week05.backend.repositories.JobSkillRepository;
import iuh.fit.zy_week05.backend.services.JobService;
import iuh.fit.zy_week05.backend.services.JobSkillService;
import iuh.fit.zy_week05.backend.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    @Autowired
    JobRepository jobRepository;

    @Autowired
    CompanyRepository companyRepository;
    @Autowired
    SkillService skillService;

    @Autowired
    JobSkillService jobSkillService;

    @Autowired
    JobSkillRepository jobSkillRepository;



    @Override
    public Page<Job> getJobsByCompanyId(Long companyId, int pageNo, int pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNo, pageSize, Sort.by("createdDate").descending());
        return jobRepository.findJobsByCompanyId(companyId, pageRequest);
    }

    @Override
    public Page<Job> getAllJobs(int pageNo, int pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNo, pageSize, Sort.by("createdDate").descending());
        return jobRepository.findAll(pageRequest);
    }

    @Override
    public Job saveJob(JobDto jobDto) {

        // Lấy thông tin công ty dựa vào companyId từ jobDto
        Company company = companyRepository.findById(jobDto.getCompanyId())
                .orElseThrow(() -> new RuntimeException("Company not found"));

        // Tạo đối tượng Job từ JobDto
        Job job = Job.builder()
                .jobDesc(jobDto.getJobDesc())
                .jobName(jobDto.getJobName())
                .company(company)
                .expiredDate(jobDto.getExpiredDate())
                .build();
        Job newJob = jobRepository.save(job);

        // Tạo các liên kết giữa Job và Skill
        for (int i = 0; i < jobDto.getSkills().size(); i++) {
            Skill skill = skillService.getSkillById(jobDto.getSkills().get(i));

            JobSkill jobSkill = new JobSkill();
            JobSkillId jobSkillId = new JobSkillId();
            jobSkillId.setJobId(newJob);
            jobSkillId.setSkillId(skill);
            jobSkill.setId(jobSkillId);
            jobSkill.setSkillLevel(SkillLevel.valueOf(jobDto.getSkillLevels().get(i)));

            jobSkillService.createJobSkill(jobSkill);
        }

        return newJob;
    }

    @Override
    public JobDetailDto getJobDetail(Long jobId) {
        Job job = jobRepository.findById(jobId)
                .orElseThrow(() -> new RuntimeException("Job not found"));

        // Lấy kỹ năng của công việc
        List<JobSkill> jobSkills = job.getJobSkills();

        // Chuyển đổi Job thành JobDetailDto
        JobDetailDto jobDetailDto = new JobDetailDto();
        jobDetailDto.setJobName(job.getJobName());
        jobDetailDto.setJobDesc(job.getJobDesc());
        jobDetailDto.setCompanyName(job.getCompany().getCompName());
        jobDetailDto.setCompanyAddress(job.getCompany().getAddress().getStreet() + ", " + job.getCompany().getAddress().getCity());
        jobDetailDto.setCompanyEmail(job.getCompany().getEmail());
        jobDetailDto.setCompanyPhone(job.getCompany().getPhone());
        jobDetailDto.setCompanyWebsite(job.getCompany().getWebUrl());
        jobDetailDto.setCreatedDate(job.getCreatedDate());
        jobDetailDto.setExpiredDate(job.getExpiredDate());
        jobDetailDto.setJobSkills(jobSkills);

        return jobDetailDto;
    }


}
