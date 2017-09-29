package Domain.domain;

import javax.persistence.*;

import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
@Entity
@SequenceGenerator(name = "seq", allocationSize = 1, sequenceName = "questions_seq")
@Table(name = "Questions")
@AttributeOverride(name = "id", column = @Column(name = "questions_id"))

public class Question extends AbstractEntity{
}
