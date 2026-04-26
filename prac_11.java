import java.util.Scanner;

class College {
    String collegeName;

    College(String name) {
        this.collegeName = name;
    }

    class Admission {
        String studentName;
        String course;

        void input() {
            Scanner sc = new Scanner(System.in);
            studentName = sc.nextLine();
            course = sc.nextLine();
        }

        void display() {
            System.out.println("College: " + collegeName);
            System.out.println("Student: " + studentName);
            System.out.println("Course: " + course);
        }
    }

    public static void main(String[] args) {
        College c = new College("ABC College");
        College.Admission a = c.new Admission();

        a.input();
        a.display();
    }
}