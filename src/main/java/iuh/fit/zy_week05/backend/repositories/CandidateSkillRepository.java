package iuh.fit.zy_week05.backend.repositories;

import iuh.fit.zy_week05.backend.entities.CandidateSkill;
import iuh.fit.zy_week05.backend.ids.CandidateSkillId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, CandidateSkillId> {
}