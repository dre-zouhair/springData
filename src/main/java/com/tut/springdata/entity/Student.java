package com.tut.springdata.entity;

import lombok.*;
import lombok.experimental.Accessors;

// use javax.persistence to make it easier to change the JPA implementation in the future
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
// or use @Data instead of this 5 annotations
@Accessors(chain = true)
@Entity // to map to a table
public class Student {

    @Id
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
}
