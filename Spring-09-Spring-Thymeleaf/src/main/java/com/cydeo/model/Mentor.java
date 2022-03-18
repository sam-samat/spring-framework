package com.cydeo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Mentor {

    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String batch;
    private Boolean graduated;
    private String company;

}
