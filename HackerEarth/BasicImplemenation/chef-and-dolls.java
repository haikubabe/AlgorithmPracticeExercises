import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            int N=in.nextInt();
            int[] arr = new int[N];
            int[] count = new int[N];
            for (int j=0;j<N;j++) {
                arr[j] = in.nextInt();
                count[arr[j]]++;
            }
            for (int k=0;k<N;k++) {
                if (count[k]%2==1) {
                    System.out.println(k);
                    break;
                }
            }
        }
    }
}