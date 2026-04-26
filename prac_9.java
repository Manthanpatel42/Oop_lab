class RectangleCompare {
    double width, height;

    RectangleCompare(double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        RectangleCompare r1 = new RectangleCompare(4, 40);
        RectangleCompare r2 = new RectangleCompare(3.5, 35.9);

        System.out.println("Rectangle 1 Area: " + r1.getArea());
        System.out.println("Rectangle 1 Perimeter: " + r1.getPerimeter());

        System.out.println("Rectangle 2 Area: " + r2.getArea());
        System.out.println("Rectangle 2 Perimeter: " + r2.getPerimeter());

        if (r1.getArea() > r2.getArea()) {
            System.out.println("Rectangle 1 has larger area");
        } else {
            System.out.println("Rectangle 2 has larger area");
        }
    }
}