import java.util.Scanner;

class TestClass {
    static void print2Smallest(int[] arr, int n) {
        if (arr.length < 2) {
            System.out.println("The size of array should be atleast 2");
            return;
        }
        int first, second;
        first = second = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < first) {
                second=first;
                first = arr[i];
            }
            else if (arr[i] < second && arr[i] != first) second = arr[i];
            System.out.println(first + " " + second);
        }
        /*for (int i = 0; i < n; i++) {
            if (arr[i] < second && arr[i] != first) second = arr[i];
        }*/
        System.out.println("The smallest element is " + first + " and the second smallest element is " + second);
    }

    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 5, 34, 1};
        print2Smallest(arr, arr.length);
    }
}