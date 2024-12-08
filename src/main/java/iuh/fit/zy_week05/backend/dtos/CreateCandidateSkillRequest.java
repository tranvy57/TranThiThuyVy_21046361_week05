package iuh.fit.zy_week05.backend.dtos;

import iuh.fit.zy_week05.backend.enums.SkillLevel;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateCandidateSkillRequest {
    private Long candidateId;
    private Long skillId;
    private String moreInfos;
    private SkillLevel skillLevel;
}
