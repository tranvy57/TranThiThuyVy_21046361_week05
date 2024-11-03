package iuh.fit.zy_week05.backend.repositories;

import iuh.fit.zy_week05.backend.entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}