package iuh.fit.zy_week05.backend.services;

import iuh.fit.zy_week05.backend.entities.Account;
import iuh.fit.zy_week05.backend.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {
    public Account getAccountByEmail(String email);
    public Account saveAccount(Account account);
    public Account login(String email, String password);
}
