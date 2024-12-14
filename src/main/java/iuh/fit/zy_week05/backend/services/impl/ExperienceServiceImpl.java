package iuh.fit.zy_week05.backend.services.impl;

import iuh.fit.zy_week05.backend.dtos.ExperienceDto;
import iuh.fit.zy_week05.backend.entities.Candidate;
import iuh.fit.zy_week05.backend.entities.Experience;
import iuh.fit.zy_week05.backend.repositories.CandidateRepository;
import iuh.fit.zy_week05.backend.repositories.ExperienceRepository;
import iuh.fit.zy_week05.backend.services.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceServiceImpl implements ExperienceService {
    @Autowired
    private ExperienceRepository experienceRepository;

    @Autowired
    private CandidateRepository candidateRepository;

    @Override
    public List<ExperienceDto> getExperienceCandidate(Long candidateId) {
        List< Experience> experiences = experienceRepository.findByCandidateId(candidateId);

        return experiences.stream().map(experience -> new ExperienceDto(
                experience.getCompanyName(),
                experience.getWorkDescription(),
                experience.getRole(),
                experience.getFromDate(),
                experience.getToDate()
        )).toList();

    }

    @Override
    public ExperienceDto addExperience(ExperienceDto experienceDto, Long candidateId) {
        Candidate candidate = candidateRepository.findById(candidateId).orElseThrow();
        Experience experience = Experience.builder()
                .companyName(experienceDto.getCompanyName())
                .workDescription(experienceDto.getWorkDescription())
                .role(experienceDto.getRole())
                .fromDate(experienceDto.getFromDate())
                .toDate(experienceDto.getToDate())
                .candidate(candidate)
                .build();

        Experience newEx = experienceRepository.save(experience);

        return new ExperienceDto(
                newEx.getCompanyName(),
                newEx.getWorkDescription(),
                newEx.getRole(),
                newEx.getFromDate(),
                newEx.getToDate()
        );

    }


}
