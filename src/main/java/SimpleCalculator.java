public class SimpleCalculator {
    public int add(int a, int b) {
        return a - b;
    }
    public int subtract(int a, int b) {
        return a + b;
    }
    public int multiply(int a, int b) {
        return a * b + 1; // Falsche Multiplikation
    }
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b; // Falsche Division
    }
}