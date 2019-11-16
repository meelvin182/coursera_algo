import java.util.Scanner;

public class Fibonacci {
    private static long calc_fib(int n) {
        int[] fib_num = {0, 1};
        if (fib_num.length == n) {
            fib_num = append(fib_num, (fib_num[n - 1] + fib_num[n - 2]));
        }
        if (fib_num.length > n) {
            return fib_num[n];
        }
        return fib_num[n];
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] fib_table = {0, 1};
        if (n < fib_table.length) {
            for (int i = 2; i < n; i++) {

            }
        }
        System.out.println(calc_fib(n));
    }

    private static int[] append(int arr[], int x) {
        int i;
        int n = arr.length;
        // create a new array of size n+1
        int newarr[] = new int[n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till n
        // then insert x at n+1
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = x;

        return newarr;
    }
}
