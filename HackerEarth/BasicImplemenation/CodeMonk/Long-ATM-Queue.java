import java.io.PrintWriter;
import java.util.Scanner;

class TestClass {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);

        int N=in.nextInt();
        int[] H = new int[N];
        for (int i=0;i<N;i++) {
            H[i]=in.nextInt();
        }
        int groups=1;
        int val = H[0];
        for (int i=1;i<N;i++) {
            if (val>H[i])
                groups++;
            val=H[i];
        }
        out.println(groups);
    }
}