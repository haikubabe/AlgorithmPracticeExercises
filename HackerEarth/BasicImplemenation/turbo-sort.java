import java.util.Scanner;
import java.util.Arrays;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int[] arr = new int[T];
        for (int i=0;i<T;i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        for (int num:arr) {
            System.out.println(num);
        }
    }
}