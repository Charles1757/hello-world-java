public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // The number of terms in the Fibonacci series to generate
        generateFibonacciSeries(n);
    }

    public static void generateFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;
        System.out.print("Fibonacci Series: " + firstTerm + " " + secondTerm);
        
        for (int i = 3; i <= n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
