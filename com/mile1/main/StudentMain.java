package com.mile1.main;
import com.mile1.bean.*;
import com.mile1.exception.*;
import com.mile1.service.*;
public class StudentMain {
	static Student data[]=new Student[4];
	public StudentMain() {
        for (int i = 0; i < data.length; i++) {
            data[i] = new Student();
        }

        data[0] = new Student("Sekar", new int[]{85, 75, 95});
        data[1] = new Student(null, new int[]{11, 22, 33});
        data[2] = null;
        data[3] = new Student("Manoj", null);
    }

    public static void main(String[] args) {
        StudentMain studentMain = new StudentMain();
        StudentReport studentReport = new StudentReport();
        StudentService studentService = new StudentService();

        for (Student student : data) {
            try {
                String validationStatus = studentReport.validate(student);
                if (validationStatus.equals("VALID")) {
                    String grade = studentReport.findGrades(student);
                    System.out.println("Grade: " + grade);
                }
            } catch (NullNameException | NullMarksArrayException | NullStudentObjectException e) {
                System.out.println(e.toString());
            }
        }

        System.out.println("Number of objects with null marks array: " + studentService.findNumberOfNullMarksArray(data));
        System.out.println("Number of objects with null name: " + studentService.findNumberOfNullName(data));
        System.out.println("Number of null objects: " + studentService.findNumberOfNullObjects(data));
    }
}
