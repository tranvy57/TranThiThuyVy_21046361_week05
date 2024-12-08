package iuh.fit.zy_week05.backend.entities;

import iuh.fit.zy_week05.backend.enums.SkillLevel;
import iuh.fit.zy_week05.backend.ids.CandidateSkillId;
import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "candidate_skill")
public class CandidateSkill {
    @EmbeddedId
    private CandidateSkillId id;

    @Column(name = "more_infos", length = 1000)
    private String moreInfos;

    @Enumerated(EnumType.ORDINAL)
    private SkillLevel skillLevel;

}