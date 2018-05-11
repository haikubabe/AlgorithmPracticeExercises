import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LifeUniverse {
    public static void main (String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        while (input != 42) {
            System.out.println(input);
            input = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        }
    }
}
