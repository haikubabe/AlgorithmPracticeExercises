import java.util.Scanner;

class TestClass {
    static int fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int res=fibonacci(5);
        System.out.println(res);
    }
}