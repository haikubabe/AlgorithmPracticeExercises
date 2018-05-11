import java.io.PrintWriter;
import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);

        int N = in.nextInt();
        int Q=in.nextInt();
        int[] arr = new int[N];
        for (int i=0;i<N;i++) {
            arr[i]=in.nextInt();
        }
        int res=0;
        for (int i=0;i<Q;i++) {
            int val=in.nextInt();
            if (val == 1) {
                int X=in.nextInt();
                if (arr[X-1]==1)
                    arr[X-1]=0;
                else
                    arr[X-1]=1;
            } else if (val==0) {
                int L=in.nextInt();
                int R = in.nextInt();
                if (arr[R-1]==1) out.println("ODD");
                else out.println("EVEN");
            }
        }
    }
}