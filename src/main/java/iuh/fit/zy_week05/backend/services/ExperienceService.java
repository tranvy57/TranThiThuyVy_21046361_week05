package iuh.fit.zy_week05.backend.services;

import iuh.fit.zy_week05.backend.dtos.ExperienceDto;

import java.util.List;

public interface ExperienceService {
    public List<ExperienceDto>  getExperienceCandidate(Long candidateId);
    public ExperienceDto addExperience(ExperienceDto experienceDto, Long candidateId);
}
