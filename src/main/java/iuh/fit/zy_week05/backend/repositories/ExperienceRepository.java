package iuh.fit.zy_week05.backend.repositories;

import iuh.fit.zy_week05.backend.entities.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {
  public List<Experience> findByCandidateId(Long candidateId);
}