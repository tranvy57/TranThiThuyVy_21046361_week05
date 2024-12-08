package iuh.fit.zy_week05.backend.services.impl;

import iuh.fit.zy_week05.backend.entities.Candidate;
import iuh.fit.zy_week05.backend.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;


    @Override
    public Candidate getCandidateByEmail(String email) {
        return candidateRepository.findByEmail(email);
    }
}
