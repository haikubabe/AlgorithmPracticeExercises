import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Fan {
    String name;
    int quotient;

    Fan(String name, int quotient) {
        this.name = name;
        this.quotient = quotient;
    }
}

public class BestPlayer {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = bufferedReader.readLine();
        String[] input = inputString.split("\\s+");
        int n = Integer.parseInt(input[0]);
        int t = Integer.parseInt(input[1]);
        Fan[] fans = new Fan[n];
        for (int i = 0; i < n; i++) {
            String str = bufferedReader.readLine();
            String[] str1 = str.split("\\s+");
            fans[i] = new Fan(str1[0], Integer.parseInt(str1[1]));
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (fans[j].quotient < fans[j + 1].quotient) {
                    Fan temp = fans[j];
                    fans[j] = fans[j + 1];
                    fans[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (fans[j].name.compareTo(fans[j + 1].name) > 0 && fans[j].quotient == fans[j + 1].quotient) {
                    Fan temp = fans[j];
                    fans[j] = fans[j + 1];
                    fans[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(fans[i].name);
        }
    }
}
