import java.io.PrintWriter;
import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);

        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        int count=0,max=0,res=0;
        for (int i=0;i<N;i++) {
            count=0;
            for (int j=0;j<N;j++) {
                if (arr[i]==arr[j]) count++;
            }
            if (count>max) {
                max=count;
                res=arr[i];
            }
        }
        out.println(res);
    }
}