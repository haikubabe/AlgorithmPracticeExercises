import java.util.Scanner;

class TestClass {
    static void print2Largest(int[] arr, int n) {
        if (arr.length < 2) {
            System.out.println("The size of array should be atleast 2");
            return;
        }
        int first, second;
        first = second = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                second=first;
                first = arr[i];
            }
            else if (arr[i] > second && arr[i] != first) second = arr[i];
        }
        /*for (int i = 0; i < n; i++) {
            if (arr[i] > second && arr[i] != first) second = arr[i];
        }*/
        System.out.println("The largest element is " + first + " and the second largest element is " + second);
    }

    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 14, 34, 1};
        print2Largest(arr, arr.length);
    }
}