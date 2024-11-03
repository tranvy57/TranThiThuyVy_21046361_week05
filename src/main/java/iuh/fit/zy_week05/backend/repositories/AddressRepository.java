package iuh.fit.zy_week05.backend.repositories;

import iuh.fit.zy_week05.backend.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}