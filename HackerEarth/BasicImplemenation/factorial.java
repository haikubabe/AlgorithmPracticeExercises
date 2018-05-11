import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            int N = in.nextInt();
            int fact = 1;
            if (N == 0) fact = 1;
            else {
                while (N!=0) {
                    fact *= N;
                    N = N-1;
                }
            }
            System.out.println(fact);
        }
    }
}