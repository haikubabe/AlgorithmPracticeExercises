import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UVa483 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            String[] str = line.split("\\s+");
            for (int i = 0; i < str.length; i++) {
                String s = str[i];
                for (int j = s.length() - 1; j >= 0; j--) {
                    System.out.print(s.charAt(j));
                }
                if (i != str.length - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
