package iuh.fit.zy_week05.backend.dtos;

import iuh.fit.zy_week05.backend.entities.Candidate;
import iuh.fit.zy_week05.backend.entities.Job;
import iuh.fit.zy_week05.backend.entities.Skill;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CandidateRecommendResponse {
    private Candidate candidate;
    private List<Skill> matchedSkills;
    private List<Skill> missedSkills;
}
