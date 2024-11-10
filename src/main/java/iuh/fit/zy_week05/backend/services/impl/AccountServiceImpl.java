package iuh.fit.zy_week05.backend.services.impl;

import iuh.fit.zy_week05.backend.entities.Account;
import iuh.fit.zy_week05.backend.repositories.AccountRepository;
import iuh.fit.zy_week05.backend.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository accountRepository;
    @Override
    public Account getAccountByEmail(String email) {
        return null;
    }

    @Override
    public Account saveAccount(Account account) {
        return null;
    }

    @Override
    public Account login(String email, String password) {
        return accountRepository.findAccountByUsernameAndPassword(email, password);
    }
}
