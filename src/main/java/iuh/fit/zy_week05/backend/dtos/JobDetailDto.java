package iuh.fit.zy_week05.backend.dtos;

import iuh.fit.zy_week05.backend.entities.JobSkill;
import iuh.fit.zy_week05.backend.entities.Skill;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobDetailDto {
    private String jobName;
    private String jobDesc;
    private String companyName;
    private String companyAddress;
    private String companyEmail;
    private String companyPhone;
    private String companyWebsite;
    private LocalDateTime createdDate;
    private LocalDateTime expiredDate;
    private List<JobSkill> jobSkills;
}
