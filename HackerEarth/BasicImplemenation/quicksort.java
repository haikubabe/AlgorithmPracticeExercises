import java.util.Scanner;

class TestClassFile {
    /*static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }*/

    //Pivot element as the last element
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int index = partition(arr, low, high);
            quicksort(arr, low, index - 1);
            quicksort(arr, index + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        int low = 0;
        int high = arr.length - 1;
        quicksort(arr, low, high);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}