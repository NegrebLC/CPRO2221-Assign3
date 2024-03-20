package com.bergen.CPRO2221.violated.SRP;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
        return courseMaterial;
    }

    // Purpose 2: giving homework
    public List<String> giveHomework(List<String> tasks) {
        List<String> newAssignment = null;

        newAssignment.addAll(tasks);

        return newAssignment;
    }

    // Purpose 3: grading assignments
    public int gradeAssignment(String assignmentQuality) {
        int grade;
        int GOOD_GRADE = 100;
        int BAD_GRADE = 50;
        int NO_GRADE = 0;

        if(assignmentQuality.equalsIgnoreCase("good")){
            grade = GOOD_GRADE;
        } else if (assignmentQuality.equalsIgnoreCase("bad")) {
            grade = BAD_GRADE;
        }else{
            grade = NO_GRADE;
        }
        return grade;
    }

}
