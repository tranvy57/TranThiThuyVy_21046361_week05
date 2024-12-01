package iuh.fit.zy_week05.backend.repositories;

import iuh.fit.zy_week05.backend.entities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
    Candidate findByEmail(String email);
}