import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NiceStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = bufferedReader.readLine();
        String[] input = inputString.split("\\s+");
        int n = Integer.parseInt(input[0]);
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = bufferedReader.readLine().split("\\s+")[0];
        }
        int niceness = 0;
        System.out.println(niceness);
        for (int i = 1; i < n; i++) {
            niceness = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (str[j].compareTo(str[i]) < 0)
                    niceness++;
            }
            System.out.println(niceness);
        }
    }
}
