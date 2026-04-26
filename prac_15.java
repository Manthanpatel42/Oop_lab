class Employee {
    String name = "John";
    String department = "IT";

    void displayDetails() {
        System.out.println(name);
        System.out.println(department);
    }
}

class Manager extends Employee {
    int teamSize = 5;

    void displayDetails() {
        System.out.println(name);
        System.out.println(department);
        System.out.println(teamSize);
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();

        e.displayDetails();
        m.displayDetails();
    }
}