import java.util.Scanner;

class TestClass {
    static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean sorted = false;
            for (int index = n - 1; index >= i + 1; index--) {
                if (arr[index] < arr[index - 1]) {
                    int temp = arr[index];
                    arr[index] = arr[index - 1];
                    arr[index - 1] = temp;
                    sorted = true;
                }
            }
            if (!sorted) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {31, 31, 41, 45, 60, 61};
        bubbleSort(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}