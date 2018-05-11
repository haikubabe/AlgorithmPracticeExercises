import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];

        for (int i=0;i<N;i++) {
            A[i] = in.nextInt();
        }
        for (int i=0;i<N;i++) {
            B[i] = in.nextInt();
        }
        for (int i=0;i<N;i++) {
            C[i] = A[i]+B[i];
            System.out.print(C[i]+" ");
        }
    }
}
