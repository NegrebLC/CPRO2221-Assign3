package com.bergen.CPRO2221.violated.SRP;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    // Purpose 1: teaching a course to students
    public String teachCourse(String courseMaterial) {
        // Logic to teach a course using the provided material
        return "Teaching course with material: " + courseMaterial;
    }

    // Purpose 2: giving homework
    public List<String> giveHomework(List<String> tasks) {
        List<String> newAssignment = new ArrayList<>(tasks);
        return newAssignment;
    }

    // Purpose 3: grading assignments
    public int gradeAssignment(String assignmentQuality) {
        final int GOOD_GRADE = 100;
        final int BAD_GRADE = 50;
        final int NO_GRADE = 0;
        int grade;

        switch (assignmentQuality.toLowerCase()) {
            case "good":
                grade = GOOD_GRADE;
                break;
            case "bad":
                grade = BAD_GRADE;
                break;
            default:
                grade = NO_GRADE;
                break;
        }

        return grade;
    }
}