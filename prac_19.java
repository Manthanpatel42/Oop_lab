package student;

public class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void displayStudent() {
        System.out.println(rollNo);
        System.out.println(name);
    }
}

package exam;

import student.Student;

public class Result extends Student {
    int m1, m2, m3;

    public Result(int rollNo, String name, int m1, int m2, int m3) {
        super(rollNo, name);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void displayResult() {
        displayStudent();
        int total = m1 + m2 + m3;
        double avg = total / 3.0;
        System.out.println(total);
        System.out.println(avg);
    }

    public static void main(String[] args) {
        Result r = new Result(1, "Manthan", 70, 80, 90);
        r.displayResult();
    }
}