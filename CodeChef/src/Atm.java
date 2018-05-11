import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Atm {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String read = bufferedReader.readLine();
        String[] splited = read.split("\\s+");
        int withdrawAmount = Integer.parseInt(splited[0]);
        double balance = Double.parseDouble(splited[1]);
        if (withdrawAmount + 0.50 <= balance && withdrawAmount % 5 == 0)
            balance = balance - withdrawAmount - 0.50;
        System.out.printf("%.2f", balance);
    }
}
