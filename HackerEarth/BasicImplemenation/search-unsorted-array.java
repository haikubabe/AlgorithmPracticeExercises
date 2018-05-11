import java.util.Scanner;

class TestClass {
    static int search(int[] arr, int n, int key) {
        for (int i=0;i<n;i++) {
            if (arr[i]==key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int N=in.nextInt();
            int[] arr=new int[N];
            for (int i=0;i<N;i++) {
                arr[i]=in.nextInt();
            }
            int key=in.nextInt();
            int index=search(arr,N,key);
            System.out.printf("Index of %d is %d", key,index);
        }
    }
}