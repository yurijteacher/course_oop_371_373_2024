package ua.com.kisit_course.example.example3.components;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class User {

    private Integer id;
    private String firstname;
    private String lastname;
    private int age;

}
