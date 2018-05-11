public class EvenFibonacciSum {
    private static int evenFib(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 2;
        return 4 * evenFib(n - 1) + evenFib(n - 2);
    }

    private static int evenFibonacci(int n) {
        int a = 1, b = 2;
        int sum = 0;
        while (b < n) {
            int temp = b;
            b = a + b;
            a = temp;
            if (a % 2 == 0)
                sum += a;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(evenFib(7));
    }
}
