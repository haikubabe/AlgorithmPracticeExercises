import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MAXCANDY {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        while (T != 0) {
            String[] line = bufferedReader.readLine().split("\\s+");
            int N = Integer.parseInt(line[0]);
            int M = Integer.parseInt(line[1]);
            int[][] arr = new int[N][M];
            for (int i = 0; i < N; i++) {
                String[] str = bufferedReader.readLine().split("\\s+");
                for (int j = 0; j < M; j++) {
                    arr[i][j] = Integer.parseInt(str[j]);
                }
            }
            int max = Integer.MIN_VALUE;
            int sum = 0,P = M;
            for (int i = 0; i < M; i++) {
                int k = P - 1;
                while (k >= 0) {
                    sum += arr[0][k];
                    k--;
                }
                P--;
            }
            T--;
        }
    }
}
