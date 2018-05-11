import java.util.Scanner;

class TestClass {
    static void selectionSortStrings(String[] arr, int n) {
        for (int lower = 0; lower < n - 1; lower++) {
            int minIndex = lower;
            for (int index = lower + 1; index < n; index++) {
                if (arr[index].compareTo(arr[minIndex])<0) {
                    minIndex = index;
                }
            }
            if (minIndex != lower) {
                String temp = arr[lower];
                arr[lower] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {"GeeksforGeeks", "Practice.GeeksforGeeks", "GeeksQuiz"};
        selectionSortStrings(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}