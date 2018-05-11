import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            long N = in.nextLong();
            int[] arr = new int[] {1,2,5,10,50,100};
            int j=5;
            int count=0;
            while (N!=0 && j>=0) {
                count += N/arr[j];
                N = N%arr[j];
                j--;
            }
            System.out.println(count);
        }
    }
}