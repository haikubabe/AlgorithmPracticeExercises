import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintFirstOccurrence {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        while (t != 0) {
            String s = bufferedReader.readLine().split("\\s+")[0];
            char[] input = s.toCharArray();
            int len = s.length();
            int[] count = new int[26];
            for (int i=0;i<len;i++) {
                int diff = input[i]-'a';
                count[diff]++;
                if (count[diff] == 1)
                    System.out.print(input[i]);
            }
            System.out.println();
            t--;
        }
    }
}
