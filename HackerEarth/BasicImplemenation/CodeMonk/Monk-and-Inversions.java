import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T!=0) {
            int N = in.nextInt();
            int[][] arr = new int[N][N];
            for (int i=0;i<N;i++) {
                for (int j=0;j<N;j++) {
                    arr[i][j] = in.nextInt();
                }
            }

            int numberofInversions = 0;

            for (int i=0;i<N;i++) {
                for (int j=0;j<N;j++) {
                    for (int p=i;p<N;p++) {
                        for (int q=j;q<N;q++) {
                            if (arr[i][j] > arr[p][q]) {
                                numberofInversions++;
                            }
                        }
                    }
                }
            }
            System.out.println(numberofInversions);
            T--;
        }
    }
}
