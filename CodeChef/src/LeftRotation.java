import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeftRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bufferedReader.readLine().split("\\s+");
        String str = line[0];
        int K = Integer.parseInt(line[1]);
        int N = str.length();
        char[] input = str.toCharArray();
        char[] output = new char[N];
        for (int i=0;i<N;i++) {
            int index = N-K+i;
            if (index>=N)
                index = index%N;
            output[index] = input[i];
        }
        System.out.println(String.valueOf(output));
    }
}
