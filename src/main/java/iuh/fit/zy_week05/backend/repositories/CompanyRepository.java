package iuh.fit.zy_week05.backend.repositories;

import iuh.fit.zy_week05.backend.entities.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CompanyRepository extends JpaRepository<Company, Long> {
    Company findCompanyById(Long id);
    Page<Company> findAll(Pageable pageable);
}