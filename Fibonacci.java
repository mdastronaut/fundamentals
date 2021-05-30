package codingInterview.famousformula;

public class Fibonacci {

    // recursion
    public static int fib(int n) {
        if (n < 0) throw new IllegalArgumentException("n is not valid");
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static int nthFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        int a = 0;
        int b = 1;

        n -= 2;
        int curr = 0;

        while (n >= 0) {
            curr = a + b;
            a = b;
            b = curr;
            n--;
        }
        return curr;
    }

    public static void fibonacciUpToN(int n) {
        if (n == 0) {
            System.out.println(0);
            return;
        }
        if (n == 1) {
            System.out.println(1);
            return;
        }
        int a = 0;
        int b = 1;
        int curr = 0;

        System.out.print(a + " " + b);
        n -= 2;

        while (n >= 0) {
            curr = a + b;
            System.out.print(" " + curr);
            a = b;
            b = curr;
            n--;
        }
    }

    public static int nthFibPlusSumUpToN(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0;
        int b = 1;
        int curr = 0;
        int sum = 1;

        System.out.print(a + " " + b);
        n -= 2;

        while (n >= 0) {
            curr = a + b;
            sum += curr;
            System.out.print(" " + curr);
            a = b;
            b = curr;
            n--;
        }
        System.out.print("\nsum: ");
        return sum;
    }
}
