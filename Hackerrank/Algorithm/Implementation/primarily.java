import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            int N = in.nextInt();
            int count=0;
            for (int j=1;j<=N;j++) {
                if (N%j==0) count++;
            }
            if (count == 2) System.out.println("yes");
            else System.out.println("no");
        }
    }
}