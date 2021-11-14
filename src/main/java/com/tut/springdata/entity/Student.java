package com.tut.springdata.entity;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.UUID;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
// or use @Data instead of this 5 annotations
@Accessors(chain = true)
public class Student {

    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
}
