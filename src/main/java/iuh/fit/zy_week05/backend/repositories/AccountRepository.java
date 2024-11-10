package iuh.fit.zy_week05.backend.repositories;

import iuh.fit.zy_week05.backend.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, String> {
    Account findAccountByUsernameAndPassword(String username, String password);

}