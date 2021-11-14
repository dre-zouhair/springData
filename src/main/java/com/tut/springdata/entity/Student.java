package com.tut.springdata.entity;

import lombok.*;
import lombok.experimental.Accessors;

// use javax.persistence to make it easier to change the JPA implementation in the future
import javax.persistence.*;
import java.math.BigInteger;

import static javax.persistence.GenerationType.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
// or use @Data instead of this 5 annotations
@Accessors(chain = true)
@Entity(name = "student") // to map to a table
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            initialValue = 2,
            allocationSize = 1 // increase of the sequence
    )
    @GeneratedValue(
            strategy = SEQUENCE, //the type of the value
            generator = "student_sequence" // specifying which generator to use
    )
    private BigInteger id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
}
