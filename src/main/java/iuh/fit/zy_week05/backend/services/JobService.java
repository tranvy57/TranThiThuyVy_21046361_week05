package iuh.fit.zy_week05.backend.services;

import iuh.fit.zy_week05.backend.entities.Job;
import org.springframework.data.domain.Page;

import java.util.List;

public interface JobService {
    Page<Job> getJobsByCompanyId(Long companyId, int pageNo, int pageSize);

}
