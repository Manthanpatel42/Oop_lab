class Shape {
    double d1, d2;

    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class Triangle extends Shape {
    double area() {
        return 0.5 * d1 * d2;
    }
}

class Rectangle extends Shape {
    double area() {
        return d1 * d2;
    }
}

class TestShape {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.getData(10, 5);
        System.out.println(t.area());

        Rectangle r = new Rectangle();
        r.getData(4, 6);
        System.out.println(r.area());
    }
}