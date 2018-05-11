import java.util.Scanner;

class TestClass {
    static void insertionSortDecreasing(int[] arr, int n) {
        for (int j = 1; j < n; j++) {
            int x = arr[j];
            int index = j - 1;
            while ((index > -1) && (arr[index] < x)) {
                arr[index + 1] = arr[index];
                index--;
            }
            arr[index + 1] = x;
        }
    }

    public static void main(String[] args) throws Exception {
        int[] arr = {31, 41, 59, 26, 41, 58};
        insertionSortDecreasing(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}