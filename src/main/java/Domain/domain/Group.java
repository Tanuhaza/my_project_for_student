package Domain.domain;

import javax.persistence.*;

import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
@Entity
@SequenceGenerator(name = "seq", allocationSize = 1, sequenceName = "group_seq")
@Table(name = "group")
@AttributeOverride(name = "id", column = @Column(name = "group_id"))
public class Group extends AbstractEntity {

    @Column(name = "group_name", nullable = false)
    private String group_name;



}
