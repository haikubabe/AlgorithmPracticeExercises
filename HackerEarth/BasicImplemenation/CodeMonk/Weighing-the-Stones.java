import java.io.PrintWriter;
import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        int T = in.nextInt();
        for (int k = 0; k < T; k++) {
            int N = in.nextInt();
            int[] r_stone = new int[N];
            int[] a_stone = new int[N];
            int[] rupam = new int[105];
            int[] ankit = new int[105];

            for (int i = 0; i < N; i++) {
                r_stone[i] = in.nextInt();
                rupam[r_stone[i]]++;
            }
            for (int i = 0; i < N; i++) {
                a_stone[i] = in.nextInt();
                ankit[a_stone[i]]++;
            }
            int max1 = rupam[0], max2 = ankit[0];
            for (int i = 0; i < 101; i++) {
                if (rupam[i] > max1) max1 = rupam[i];
                if (ankit[i] > max2) max2 = ankit[i];
            }

            int r = 0, a = 0;
            for (int i = 0; i < N; i++) {
                if (rupam[i] == max1) r = i;
                if (ankit[i] == max2) a = i;
            }

            if (r > a) out.println("Rupam");
            if (r < a) out.println("Ankit");
            if (r == a) out.println("Tie");
        }
    }
}