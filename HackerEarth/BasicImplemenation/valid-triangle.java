import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            int sum = 0;
            if (A!=0 && B!=0 && C!=0) {
                sum = A+B+C;
                if (sum == 180) System.out.println("YES");
                else System.out.println("NO");
            } else {
                System.out.println("NO");
            }
        }
    }
}