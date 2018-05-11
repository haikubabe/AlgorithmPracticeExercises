import java.util.Scanner;
import java.util.Arrays;

class TestClass {
    static int sum(int D, int N) {
        if (D==0) return N;
        else return sum(D-1,N*(N+1)/2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            int D=in.nextInt();
            int N=in.nextInt();
            int sum=sum(D,N);
            System.out.println(sum);
        }
    }
}