import java.util.Scanner;

class TestClass {
    static int linearSearch(int[] arr, int n, int item) {
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (item == arr[i])
                index = i;
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(linearSearch(arr, N, 3));
    }
}