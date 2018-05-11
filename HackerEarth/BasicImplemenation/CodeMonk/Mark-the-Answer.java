import java.io.PrintWriter;
import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);

        int N = in.nextInt();
        int X = in.nextInt();
        int count = 0, skip = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
            if (arr[i] <= X) count++;
            else skip++;
            if (skip > 1) break;
        }
        out.println(count);
    }
}