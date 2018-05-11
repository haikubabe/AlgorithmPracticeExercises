import java.util.Scanner;

class TestClass {
    static int insert(int[] arr, int n, int key, int capacity) {
        if (n>=capacity) {
            return n;
        }
        arr[n]=key;
        return n+1;
    }

    public static void main(String[] args) throws Exception {
        int n=5;
        int[] arr=new int[6];
        int capacity=6;
        int key=8;
        arr[0]=3;
        arr[1]=2;
        arr[2]=4;
        arr[3]=1;
        arr[4]=5;
        System.out.print("Before Insertion: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");

        n = insert(arr, n, key, capacity);

        System.out.print("\nAfter Insertion: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}