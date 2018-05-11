import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            int N = in.nextInt();
            int last = N%10;
            int first=0;
            while (N != 0) {
                first = N;
                N = N/10;
            }
            System.out.println(last+first);
        }
    }
}