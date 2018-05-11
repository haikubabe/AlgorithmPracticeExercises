import java.util.Scanner;

class TestClass {
    static int minElement(int[] arr,int n) {
        int min=arr[0];
        for (int i=0;i<n;i++) {
            if (arr[i]<min) min=arr[i];
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int[] arr = new int[100000];
        for (int k = 0; k < T; k++) {
            int N = in.nextInt();
            int K = in.nextInt();
            for (int i = 0; i < N; i++) {
                arr[i] = in.nextInt();
            }
            int min = minElement(arr,N);
            if (K>min)
                System.out.println(K-min);
            else
                System.out.println(0);
        }
    }
}