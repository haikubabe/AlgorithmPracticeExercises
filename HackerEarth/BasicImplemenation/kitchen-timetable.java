import java.util.Scanner;
import java.util.Arrays;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            int count=0;
            for (int j=0;j<N;j++) {
                A[j] = in.nextInt();
            }
            for (int k=0;k<N;k++) {
                B[k] = in.nextInt();
            }
            int moment=0;
            for (int p=0;p<N;p++) {
                for (int q=p;q<=p;q++) {
                    if (p==0) {
                        moment = A[p];
                    } else {
                        moment = A[p]-A[p-1];
                    }
                    if (moment>=B[q]) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}