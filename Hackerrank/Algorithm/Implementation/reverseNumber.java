import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            int N = in.nextInt();
            int ans = 0;
            while (N!=0) {
                ans = ans*10 + N%10;
                N = N/10;
            }
            System.out.println(ans);
        }
    }
}