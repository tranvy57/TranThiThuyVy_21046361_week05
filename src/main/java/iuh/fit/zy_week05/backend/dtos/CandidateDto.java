package iuh.fit.zy_week05.backend.dtos;

import iuh.fit.zy_week05.backend.entities.Address;
import iuh.fit.zy_week05.backend.entities.Experience;
import iuh.fit.zy_week05.backend.entities.Skill;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * DTO for {@link iuh.fit.zy_week05.backend.entities.Candidate}
 */
@Value
@Getter
@Setter
public class CandidateDto implements Serializable {
    Long id;
    LocalDate dob;
    String email;
    String fullName;
    String phone;
    Address address;
    List<Skill> skills;
    List<Experience> experiences;
}