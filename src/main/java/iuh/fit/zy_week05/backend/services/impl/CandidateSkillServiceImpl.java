package iuh.fit.zy_week05.backend.services.impl;

import iuh.fit.zy_week05.backend.dtos.CreateCandidateSkillRequest;
import iuh.fit.zy_week05.backend.entities.Candidate;
import iuh.fit.zy_week05.backend.entities.CandidateSkill;
import iuh.fit.zy_week05.backend.entities.Skill;
import iuh.fit.zy_week05.backend.ids.CandidateSkillId;
import iuh.fit.zy_week05.backend.repositories.CandidateRepository;
import iuh.fit.zy_week05.backend.repositories.CandidateSkillRepository;
import iuh.fit.zy_week05.backend.repositories.SkillRepository;
import iuh.fit.zy_week05.backend.services.CandidateSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateSkillServiceImpl implements CandidateSkillService{

    @Autowired
    private SkillRepository skillRepository;

    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private CandidateSkillRepository candidateSkillRepository;


    public void addCandidateSkill(CreateCandidateSkillRequest request) {
        Candidate candidate = candidateRepository.findById(request.getCandidateId())
                .orElseThrow(() -> new RuntimeException("Candidate not found"));

        Skill skill = skillRepository.findById(request.getSkillId())
                .orElseThrow(() -> new RuntimeException("Skill not found"));

        CandidateSkill candidateSkill = new CandidateSkill();
        CandidateSkillId candidateSkillId = new CandidateSkillId();
        candidateSkillId.setCanId(candidate);
        candidateSkillId.setSkillId(skill);

        candidateSkill.setId(candidateSkillId);
        candidateSkill.setMoreInfos(request.getMoreInfos());
        candidateSkill.setSkillLevel(request.getSkillLevel());

        candidateSkillRepository.save(candidateSkill);
    }
}
