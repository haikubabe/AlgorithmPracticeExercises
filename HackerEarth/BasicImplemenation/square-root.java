import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int j=0;j<T;j++) {
            int N = in.nextInt();
            int sqrt = (int)Math.sqrt(N);
            System.out.println(sqrt);
        }
    }
}