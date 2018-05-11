import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            int N = in.nextInt();
            int[] arr = new int[N];
            int countOne=0,countZero=0;
            for (int j=0;j<N;j++) {
                arr[j] = in.nextInt();
            }
            for (int k=0;k<N;k++) {
                if (arr[k]==1) countOne++;
                else if (arr[k]==0) countZero++;
            }
            if (countOne==1||countZero==1) System.out.println(1);
            else if (countOne==N||countZero==N) System.out.println(N);
            else System.out.println(0);
        }
    }
}