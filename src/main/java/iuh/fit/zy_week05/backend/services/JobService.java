package iuh.fit.zy_week05.backend.services;

import iuh.fit.zy_week05.backend.dtos.JobDetailDto;
import iuh.fit.zy_week05.backend.dtos.JobDto;
import iuh.fit.zy_week05.backend.entities.Job;
import org.springframework.data.domain.Page;

public interface JobService {
    Page<Job> getJobsByCompanyId(Long companyId, int pageNo, int pageSize);
    Page<Job> getAllJobs(int pageNo, int pageSize);
    Job saveJob(JobDto jobDto);
    JobDetailDto getJobDetail(Long jobId);
}
