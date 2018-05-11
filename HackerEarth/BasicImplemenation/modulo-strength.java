import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int[] arr = new int[N];
        long[] temp = new long[K];
        long sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
            temp[arr[i] % K]++;
        }

        for (int i = 0; i < K; i++) {
            sum += temp[i] * (temp[i] - 1);
        }
        System.out.println(sum);
    }
}