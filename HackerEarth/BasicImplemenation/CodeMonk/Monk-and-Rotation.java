import java.io.PrintWriter;
import java.util.Scanner;

class TestClass {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        int T=in.nextInt();
        for (int k=0;k<T;k++) {
            int N=in.nextInt();
            int K=in.nextInt();
            int[] arr = new int[1000000];
            for (int i=0;i<N;i++) {
                arr[i]=in.nextInt();
            }
            if (K>N)
                K=K%N;
            int elementPosition = (N-(K-1))-1;
            if (elementPosition<N)
                out.print(arr[elementPosition]+" ");

            for (int i=elementPosition+1;i<N;i++) {
                out.print(arr[i]+" ");
            }
            for (int i=0;i<elementPosition;i++) {
                out.print(arr[i]+" ");
            }
            out.println();
        }
    }
}