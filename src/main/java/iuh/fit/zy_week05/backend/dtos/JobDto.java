package iuh.fit.zy_week05.backend.dtos;

import iuh.fit.zy_week05.backend.entities.Job;
import iuh.fit.zy_week05.backend.entities.JobSkill;
import iuh.fit.zy_week05.backend.entities.Skill;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * DTO for {@link Job}
 */

@Builder
@Setter
@Getter
@AllArgsConstructor
public class JobDto  {
    String jobDesc;
    @NotNull
    String jobName;
    List<Long> skills;
    List<String> skillLevels;
    @NotNull
    Long companyId;

    @NotNull
    LocalDateTime expiredDate;

    public JobDto() {

    }
}