import java.util.Scanner;

class TestClass {
    static long fibonacci(long n) {
        long n1 = 0, n2 = 1;
        if (n == 0) return n1;
        else if (n == 1) return n2;
        else {
            long n3=-1;
            for (int i = 2; i <= n; i++) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
            return n3;
        }
    }

    public static void main(String[] args) {
        long res = fibonacci(11);
        System.out.println(res);
    }
}