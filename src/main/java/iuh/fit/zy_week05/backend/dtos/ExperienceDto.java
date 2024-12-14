package iuh.fit.zy_week05.backend.dtos;

import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link iuh.fit.zy_week05.backend.entities.Experience}
 */
@Value
public class ExperienceDto implements Serializable {
    String companyName;
    String workDescription;
    String role;
    LocalDate fromDate;
    LocalDate toDate;
}