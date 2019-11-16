import java.util.*;

public class FibonacciSumSquares {
    private static long getFibonacciSumSquaresNaive(long n) {
        if (n <= 0)
            return 0;

        int fibo[] = new int[(int) n + 1];
        fibo[0] = 0;
        fibo[1] = 1;

        // Initialize result
        int sum = (fibo[0] * fibo[0]) + (fibo[1] * fibo[1]);

        // Add remaining terms
        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
            sum += (fibo[i] * fibo[i]);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getFibonacciSumSquaresNaive(n);
        System.out.println(s);
    }
}

