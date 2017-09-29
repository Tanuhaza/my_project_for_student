package Domain.domain;

import javax.persistence.*;

import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
@Entity
@SequenceGenerator(name = "seq", allocationSize = 1, sequenceName = "student_seq")
@Table(name = "students")
@AttributeOverride(name = "id", column = @Column(name = "student_id"))

public class Student extends AbstractEntity{
}
