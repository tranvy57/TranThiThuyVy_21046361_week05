package iuh.fit.zy_week05.backend.services.impl;

import iuh.fit.zy_week05.backend.entities.Job;
import iuh.fit.zy_week05.backend.repositories.JobRepository;
import iuh.fit.zy_week05.backend.services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    @Autowired
    JobRepository jobRepository;


    @Override
    public Page<Job> getJobsByCompanyId(Long companyId, int pageNo, int pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNo, pageSize);
        return jobRepository.findJobsByCompanyId(companyId, pageRequest);
    }
}
