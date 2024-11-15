package iuh.fit.zy_week05.backend.services;


import iuh.fit.zy_week05.backend.entities.Skill;

import java.util.List;

public interface SkillService{
    List<Skill> getAllSkills();
    Skill getSkillById(Long id);
}
