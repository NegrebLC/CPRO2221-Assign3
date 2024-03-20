package com.bergen.CPRO2221.solved.SRP;

public class Grader {
    public int gradeAssignment(String assignmentQuality) {
        final int GOOD_GRADE = 100;
        final int BAD_GRADE = 50;
        final int NO_GRADE = 0;

        switch (assignmentQuality.toLowerCase()) {
            case "good":
                return GOOD_GRADE;
            case "bad":
                return BAD_GRADE;
            default:
                return NO_GRADE;
        }
    }
}