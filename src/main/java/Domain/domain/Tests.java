package Domain.domain;

import javax.persistence.*;

import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
@Entity
@SequenceGenerator(name = "seq", allocationSize = 1, sequenceName = "test_seq")
@Table(name = "tests")
@AttributeOverride(name = "id", column = @Column(name = "test_id"))

public class Tests extends AbstractEntity {
}
