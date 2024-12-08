package iuh.fit.zy_week05.backend.services.impl;

import iuh.fit.zy_week05.backend.entities.Candidate;
import org.springframework.stereotype.Service;

@Service
public interface CandidateService {
    Candidate getCandidateByEmail(String email);
}
