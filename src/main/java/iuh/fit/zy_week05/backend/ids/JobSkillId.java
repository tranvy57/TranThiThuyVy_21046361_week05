package iuh.fit.zy_week05.backend.ids;

import iuh.fit.zy_week05.backend.entities.Job;
import iuh.fit.zy_week05.backend.entities.Skill;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class JobSkillId implements Serializable {
    private static final long serialVersionUID = -425352920139142762L;
    @ManyToOne
    @JoinColumn(name = "job_id", nullable = false)
    private Job jobId;

    @ManyToOne
    @JoinColumn(name = "skill_id", nullable = false)
    private Skill skillId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        JobSkillId entity = (JobSkillId) o;
        return Objects.equals(this.jobId, entity.jobId) &&
                Objects.equals(this.skillId, entity.skillId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, skillId);
    }

}