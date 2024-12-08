package iuh.fit.zy_week05.backend.services;

import iuh.fit.zy_week05.backend.dtos.CreateCandidateSkillRequest;
import iuh.fit.zy_week05.backend.entities.CandidateSkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CandidateSkillService {
    void addCandidateSkill(CreateCandidateSkillRequest request);
}
