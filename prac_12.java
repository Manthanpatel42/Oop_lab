class Volume {
    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double l, double w, double h) {
        return l * w * h;
    }

    double calculateVolumeSphere(double r) {
        return (4.0 / 3.0) * Math.PI * r * r * r;
    }

    public static void main(String[] args) {
        Volume v = new Volume();

        System.out.println(v.calculateVolume(3));
        System.out.println(v.calculateVolume(2, 3, 4));
        System.out.println(v.calculateVolumeSphere(2));
    }
}