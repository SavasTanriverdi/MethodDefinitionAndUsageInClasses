public class Main {
    public static void main(String[] args) {
        // Creating an object of Calculator class
        Calculator calculator = new Calculator();

        // Using methods from Calculator class
        System.out.println("Addition of 10 and 5: " + calculator.add(10, 5));
        System.out.println("Subtraction of 10 and 5: " + calculator.subtract(10, 5));
        System.out.println("Multiplication of 10 and 5: " + calculator.multiply(10, 5));
        System.out.println("Division of 10 by 5: " + calculator.divide(10, 5));
    }
}