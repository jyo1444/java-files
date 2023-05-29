package com.mile1.service;
import com.mile1.bean.*;
import com.mile1.exception.*;
public class StudentReport {
	public String findGrades(Student studentObject) {
        int[] marks = studentObject.getMarks();

        for (int mark : marks) {
            if (mark < 35) {
                studentObject.setGrade("F");
                return studentObject.getGrade();
            }
        }

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        if (sum < 150)
            studentObject.setGrade("C");
        else if (sum < 200)
            studentObject.setGrade("B");
        else if (sum < 250)
            studentObject.setGrade("A");
        else
            studentObject.setGrade("A+");

        return studentObject.getGrade();
    }

    public String validate(Student s) throws NullNameException, NullMarksArrayException, NullStudentObjectException {
        if (s == null) {
            throw new NullStudentObjectException();
        } else {
            String name = s.getName();
            int[] marks = s.getMarks();

            if (name == null) {
                throw new NullNameException();
            } else if (marks == null) {
                throw new NullMarksArrayException();
            } else {
                return "VALID";
            }
        }
    }
}
