package iuh.fit.zy_week05.backend.dtos;

import iuh.fit.zy_week05.backend.entities.JobSkill;
import iuh.fit.zy_week05.backend.entities.Skill;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobRecommendResponse {
    private Long jobId;
    private List<Skill> matchedSkills;
    private List<Skill> missedSkills;
}

