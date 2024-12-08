package iuh.fit.zy_week05.backend.services;

import iuh.fit.zy_week05.backend.dtos.CreateCandidateSkillRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface CandidateSkillService {
    void addCandidateSkill(CreateCandidateSkillRequest request);

}
