package iuh.fit.zy_week05.backend.services.impl;

import iuh.fit.zy_week05.backend.entities.Skill;
import iuh.fit.zy_week05.backend.repositories.SkillRepository;
import iuh.fit.zy_week05.backend.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SkillServiceImpl implements SkillService {
    @Autowired
    public SkillRepository skillRepository;

    @Override
    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }

    @Override
    public Skill getSkillById(Long id) {
        return skillRepository.findById(id).orElse(null);
    }
}
