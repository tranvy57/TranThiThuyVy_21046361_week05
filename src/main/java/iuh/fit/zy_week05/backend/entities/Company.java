package iuh.fit.zy_week05.backend.entities;

import iuh.fit.zy_week05.backend.enums.Role;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comp_id", nullable = false)
    private Long id;

    @Column(name = "about", length = 2000)
    private String about;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "comp_name", nullable = false)
    private String compName;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "web_url")
    private String webUrl;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "address", nullable = false)
    private Address address;

    @OneToMany(mappedBy = "company", fetch = FetchType.EAGER)
    private List<Job> job;

    @Enumerated(EnumType.STRING)
    private Role role;

}