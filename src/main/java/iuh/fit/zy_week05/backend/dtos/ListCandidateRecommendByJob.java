package iuh.fit.zy_week05.backend.dtos;

import iuh.fit.zy_week05.backend.entities.Job;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ListCandidateRecommendByJob {
    private Job job;
    private List<CandidateRecommendResponse> candidateRecommendResponses;
}
