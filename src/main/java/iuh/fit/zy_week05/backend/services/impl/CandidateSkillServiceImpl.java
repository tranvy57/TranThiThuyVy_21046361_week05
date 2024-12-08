package iuh.fit.zy_week05.backend.services.impl;

import iuh.fit.zy_week05.backend.dtos.CreateCandidateSkillRequest;
import iuh.fit.zy_week05.backend.entities.Candidate;
import iuh.fit.zy_week05.backend.entities.CandidateSkill;
import iuh.fit.zy_week05.backend.entities.Skill;
import iuh.fit.zy_week05.backend.ids.CandidateSkillId;
import iuh.fit.zy_week05.backend.repositories.CandidateRepository;
import iuh.fit.zy_week05.backend.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CandidateSkillServiceImpl {

    @Autowired
    private SkillRepository skillRepository;
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
