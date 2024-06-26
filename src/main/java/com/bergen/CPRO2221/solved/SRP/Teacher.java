package com.bergen.CPRO2221.solved.SRP;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}