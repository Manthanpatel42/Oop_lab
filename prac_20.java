class Division {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(args[0]);
            int den = Integer.parseInt(args[1]);
            int result = num / den;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Arguments missing");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        }
    }
}