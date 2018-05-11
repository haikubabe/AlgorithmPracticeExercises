import java.util.Scanner;

class TestClass {
    static int findOdd(int[] arr, int n) {
        int res=0;
        for (int i=0;i<n;i++) {
            res^=arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={12, 12, 14, 90, 90, 50, 14, 14, 14};
        System.out.println(findOdd(arr,arr.length));
    }
}