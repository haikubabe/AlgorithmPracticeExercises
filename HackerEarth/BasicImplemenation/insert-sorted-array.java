import java.util.Scanner;

class TestClass {
    static int insertSorted(int[] arr, int n, int key, int capacity) {
        if (n >= capacity) return n;
        int i = 0;
        for (i = n - 1; (arr[i] > key && i >= 0); i--) {
            arr[i + 1] = arr[i];
        }
        arr[i + 1] = key;
        return n + 1;
    }

    public static void main(String[] args) throws Exception {
        int[] arr = new int[8];
        arr[0]=1;
        arr[1]=2;
        arr[2]=4;
        arr[3]=5;
        arr[4]=7;
        arr[5]=8;
        arr[6]=9;
        int n=7;
        int capacity = arr.length;
        int key = 3;
        n = insertSorted(arr, n, key, capacity);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}