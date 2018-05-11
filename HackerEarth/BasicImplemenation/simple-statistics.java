import java.util.Scanner;
import java.util.Arrays;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            int K = in.nextInt();
            int[] arr = new int[N];
            int sum=0;
            double average=0;
            for (int j = 0; j < N; j++) {
                arr[j] = in.nextInt();
            }
            Arrays.sort(arr);
            for (int l=0+K;l<N-K;l++) {
                sum += arr[l];
            }
            average = (double)sum/(N-2*K);
            System.out.printf("%f\n",average);
        }
    }
}