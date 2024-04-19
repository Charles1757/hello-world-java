public class FibonacciSeries {

    public static int[] generateFibonacciSeries(int n) {
        int[] series = new int[n];
        
        if (n >= 1) series[0] = 0;
        if (n >= 2) series[1] = 1;

        for (int i = 2; i < n; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }
        
        return series;
    }
}