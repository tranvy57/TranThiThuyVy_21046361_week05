package iuh.fit.zy_week05.backend.entities;

import iuh.fit.zy_week05.backend.enums.UserType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "account")
public class Account {
    @Id
    private String username;
    private String password;
    private String role;
    @Enumerated
    private UserType userType;

}
