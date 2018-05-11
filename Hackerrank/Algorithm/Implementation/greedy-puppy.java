import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            int N = in.nextInt();
            int K = in.nextInt();
            int maxCoins = N%K;
            System.out.println(maxCoins);
        }
    }
}