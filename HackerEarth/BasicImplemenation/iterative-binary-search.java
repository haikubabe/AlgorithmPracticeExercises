import java.util.Scanner;

class TestClass {
    static int binarySearch(int[] arr, int l, int r, int x) {
        while (l<=r) {
            int mid=(l+r)/2;
            if (arr[mid]==x) return mid;
            else if (x<arr[mid]) r=mid-1;
            else l=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        int[] arr = {1, 2, 4, 5, 7, 8, 9};
        int r = arr.length - 1;
        int x = 10;
        int index = binarySearch(arr, 0, r, x);
        System.out.println(index);
    }
}