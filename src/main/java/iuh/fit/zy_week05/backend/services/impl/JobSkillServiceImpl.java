package iuh.fit.zy_week05.backend.services.impl;

import iuh.fit.zy_week05.backend.entities.JobSkill;
import iuh.fit.zy_week05.backend.repositories.JobSkillRepository;
import iuh.fit.zy_week05.backend.services.JobSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobSkillServiceImpl implements JobSkillService {
    @Autowired
    JobSkillRepository jobSkillRepository;
    @Override
    public JobSkill createJobSkill(JobSkill jobSkill) {
        return jobSkillRepository.save(jobSkill);
    }
}
