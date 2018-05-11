import java.util.Scanner;

class TestClass {
    static int findPos(int[] arr, int n, int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        int[] arr = {2, 5, 4, 1, 3};
        int n=arr.length;
        int key=4;
        int index=findPos(arr,n,key);
        if (index==-1) System.out.println("No element to be deleted");
        else {
            for (int i=index;i<n-1;i++) {
                arr[i]=arr[i+1];
            }
            n=n-1;
            for (int i=0;i<n;i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}