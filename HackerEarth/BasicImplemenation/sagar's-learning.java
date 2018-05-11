import java.util.Scanner;

class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            long N = in.nextLong();
            if (N <= 2) {
                System.out.println(-1);
            } else {
                N /= 3;
                System.out.println(N + " " + N * 2 + " " + N * 3);
            }
        }
    }
}