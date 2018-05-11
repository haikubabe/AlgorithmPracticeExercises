import java.util.Scanner;

class TestClass {
    static int binarySearch(int[] arr, int l, int r, int x) {
        if (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == x) return mid;
            else if (x < arr[mid]) return binarySearch(arr, l, mid - 1, x);
            else return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        int[] arr = {1, 2, 4, 5, 7, 8, 9};
        int r = arr.length - 1;
        int x = 8;
        int index = binarySearch(arr, 0, r, x);
        System.out.println(index);
    }
}