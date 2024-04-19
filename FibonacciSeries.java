import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {
    
    public static List<Integer> generateFibonacciSeries(int n) {
        // List to hold Fibonacci series
        List<Integer> fibSeries = new ArrayList<>();
        
        // Base cases
        if (n >= 1) {
            fibSeries.add(0);
        }
        
        if (n >= 2) {
            fibSeries.add(1);
        }
        
        // Generate the Fibonacci series up to n elements
        for (int i = 2; i < n; i++) {
            int nextFibNumber = fibSeries.get(i - 1) + fibSeries.get(i - 2);
            fibSeries.add(nextFibNumber);
        }
        
        return fibSeries;
    }
    
    public static void main(String[] args) {
        // Example to generate first 10 elements of Fibonacci series
        List<Integer> fibonacciSeries = generateFibonacciSeries(10);
        System.out.println(fibonacciSeries);
    }
}
