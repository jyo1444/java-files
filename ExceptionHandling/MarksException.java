package ExceptionHandling;
import java.util.Scanner;

class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

class Student {
    private String name;
    private int[] marks;

    public Student(String name) {
        this.name = name;
        this.marks = new int[3];
    }

    public void setMarks(int subjectIndex, int marks) throws NegativeValueException, OutOfRangeException {
        if (marks < 0) {
            throw new NegativeValueException("Negative value not allowed for marks");
        }
        if (marks < 0 || marks > 100) {
            throw new OutOfRangeException("Marks should be in the range of 0-100");
        }
        this.marks[subjectIndex] = marks;
    }

    public double getAverageMarks() {
        double sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    public String getName() {
        return name;
    }
}

public class MarksException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the name of student 1: ");
            String name1 = sc.nextLine();
            Student student1 = new Student(name1);
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + " for student 1: ");
                int marks = Integer.parseInt(sc.nextLine());
                student1.setMarks(i, marks);
            }

            System.out.print("Enter the name of student 2: ");
            String name2 = sc.nextLine();
            Student student2 = new Student(name2);
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + " for student 2: ");
                int marks = Integer.parseInt(sc.nextLine());
                student2.setMarks(i, marks);
            }

            double averageMarks1 = student1.getAverageMarks();
            double averageMarks2 = student2.getAverageMarks();

            System.out.println("Average marks for " + student1.getName() + ": " + averageMarks1);
            System.out.println("Average marks for " + student2.getName() + ": " + averageMarks2);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input format. Please enter integers for marks.");
        } catch (NegativeValueException e) {
            System.out.println(e.getMessage());
        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
