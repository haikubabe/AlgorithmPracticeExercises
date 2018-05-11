import java.util.Scanner;
import java.util.Arrays;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            int N=in.nextInt();
            int[] L = new int[N];
            int[] R = new int[N];
            int index=0;
            int res = L[0]*R[0];
            for (int j=0;j<N;j++) {
                L[j] = in.nextInt();
            }
            for (int k=0;k<N;k++) {
                R[k] = in.nextInt();
            }
            for (int p=1;p<N;p++) {
                for (int q=p;q<=p;q++) {
                    if (res == L[p]*R[q]) {

                    }
                }
            }
        }
    }
}