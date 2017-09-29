package Domain.domain;

import javax.persistence.*;

import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
@Entity
@SequenceGenerator(name = "seq", allocationSize = 1, sequenceName = "faculty_seq")
@Table(name = "faculty")
@AttributeOverride(name = "id", column = @Column(name = "faculty_id"))

public class Faculty extends AbstractEntity{
}
