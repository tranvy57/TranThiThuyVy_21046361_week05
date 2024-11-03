package iuh.fit.zy_week05.backend.repositories;

import iuh.fit.zy_week05.backend.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}