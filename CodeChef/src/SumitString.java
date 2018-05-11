import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumitString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        while (t != 0) {
            String s = bufferedReader.readLine().split("\\s+")[0];
            char[] ch = s.toCharArray();
            int len = s.length();
            boolean flag = true;
            for (int i = 0, j = i + 1; i < len - 1 && j < len; i++, j++) {
                int res = Math.abs(ch[i] - ch[j]);
                if (res == 25) {
                    flag = true;
                } else if (res != 1) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}