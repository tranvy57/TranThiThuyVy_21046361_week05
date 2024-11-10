package iuh.fit.zy_week05.backend.entities;

import iuh.fit.zy_week05.backend.enums.UserType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "accounts")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {
    @Id
    private String username;
    private String password;
    private String role;
    @Enumerated
    private UserType userType;

}
