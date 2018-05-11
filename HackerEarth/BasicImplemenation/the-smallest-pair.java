import java.util.Scanner;
import java.util.Arrays;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T>0) {
            int N=in.nextInt();
            int[] arr = new int[N];
            for (int j=0;j<N;j++) {
                arr[j] = in.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[0]+arr[1]);
            T--;
        }
    }
}