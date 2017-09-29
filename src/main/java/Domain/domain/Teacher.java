package Domain.domain;

import javax.persistence.*;

import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
@Entity
@SequenceGenerator(name = "seq", allocationSize = 1, sequenceName = "teacher_seq")
@Table(name = "teachers")
@AttributeOverride(name = "id", column = @Column(name = "teacher_id"))

public class Teacher extends AbstractEntity{
}
