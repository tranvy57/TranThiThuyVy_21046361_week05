package iuh.fit.zy_week05.backend.repositories;

import iuh.fit.zy_week05.backend.entities.JobSkill;
import iuh.fit.zy_week05.backend.ids.JobSkillId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSkillRepository extends JpaRepository<JobSkill, JobSkillId> {
}