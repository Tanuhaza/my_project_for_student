package Domain.domain;

import javax.persistence.*;

import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
@Entity
@SequenceGenerator(name = "seq", allocationSize = 1, sequenceName = "var_seq")
@Table(name = "variants")
@AttributeOverride(name = "id", column = @Column(name = "var_id"))

public class Variant extends AbstractEntity{
}
