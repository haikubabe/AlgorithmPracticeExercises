import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        while (t != 0) {
            String s = bufferedReader.readLine();
            s = s.toUpperCase();
            char[] input = s.toCharArray();
            int len = s.length();
            String str = "";
            for (int i = 0; i < len; i++) {
                char ch = input[i];
                if (ch == ' ') {
                    str += "$";
                } else {
                    str += ch - 'A' + 1;
                }
            }
            System.out.println(str);
            t--;
        }
    }
}
