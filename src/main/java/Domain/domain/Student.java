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

    @Column(name="first_name", nullable = false)
    private String first_name;

    @Column(name="last_name", nullable = false)
    private String last_name;

    @Column(name="borth_date", nullable = false)
    private String borth_date;

    @Column(name="cell_phone", nullable = false)
    private String cell_phone;

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    private Group group;

}
