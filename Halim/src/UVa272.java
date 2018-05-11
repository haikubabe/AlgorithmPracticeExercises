import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UVa272 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        boolean openQuote = true;
        while ((line = bufferedReader.readLine()) != null) {
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (ch == '.') {
                    System.out.print(ch);
                    break;
                }
                if (ch == '"') {
                    if (openQuote) {
                        System.out.print("``");
                        openQuote = false;
                        continue;
                    } else {
                        System.out.print("''");
                        openQuote = true;
                        continue;
                    }
                }
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
