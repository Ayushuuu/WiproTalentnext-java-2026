package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;
import com.mile1.exception.*;

public class StudentMain {
    static Student[] data = new Student[4];

    public StudentMain() {
        // initialize the objects
        data[0] = new Student("Sekar", new int[]{85, 75, 95}, null);
        data[1] = new Student(null, new int[]{11, 22, 33}, null);
        data[2] = null;
        data[3] = new Student("Manoj", null, null);
    }

    public static void main(String[] args) {
        StudentMain sm = new StudentMain();
        StudentReport report = new StudentReport();
        StudentService service = new StudentService();

        for (int i = 0; i < data.length; i++) {
            try {
                String result = report.validate(data[i]);
                if (result.equals("VALID")) {
                    String grade = report.findGrades(data[i]);
                    System.out.println("Grade = " + grade);
                }
            } catch (NullNameException | NullMarksArrayException | NullStudentObjectException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Number of objects with Marks array as null: "
                + service.findNumberOfNullMarksArray(data));
        System.out.println("Number of objects with Name as null: "
                + service.findNumberOfNullName(data));
        System.out.println("Number of objects that are entirely null: "
                + service.findNumberOfNullObjects(data));
    }
}
