package iuh.fit.zy_week05.backend.repositories;

import iuh.fit.zy_week05.backend.entities.Job;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long> {
    Page<Job> findJobsByCompanyId(Long id, Pageable pageable);
}