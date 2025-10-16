package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.*;

public class StudentReport {

    // --- findGrades() ---
    public String findGrades(Student studentObject) {
        int[] marks = studentObject.getMarks();

        for (int mark : marks) {
            if (mark < 35) {
                studentObject.setGrade("F");
                return "F";
            }
        }

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        String grade;
        if (sum < 150)
            grade = "C";
        else if (sum < 200)
            grade = "B";
        else if (sum < 250)
            grade = "A";
        else
            grade = "A+";

        studentObject.setGrade(grade);
        return grade;
    }

    // --- validate() ---
    public String validate(Student s)
            throws NullNameException, NullMarksArrayException, NullStudentObjectException {

        if (s == null)
            throw new NullStudentObjectException();
        else if (s.getName() == null)
            throw new NullNameException();
        else if (s.getMarks() == null)
            throw new NullMarksArrayException();
        else
            return "VALID";
    }
}
