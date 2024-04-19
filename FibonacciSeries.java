public class FibonacciSeries {

    public static void main(String[] args) {
        // The number of Fibonacci numbers to generate, for example, 10.
        int n = 10;
        generateFibonacciSeries(n);
    }

    public static void generateFibonacciSeries(int n) {
        // Check if n is non-positive
        if (n <= 0) {
            System.out.println("The number of terms must be positive.");
            return;
        }

        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b);

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }
}
