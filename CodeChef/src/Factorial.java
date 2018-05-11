import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Factorial {

    public static String factorial(int n) {
        BigInteger fact = new BigInteger("1");
        for (int i=1;i<=n;i++) {
            fact = fact.multiply(new BigInteger(i + ""));
        }
        return fact.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(bufferedReader.readLine());
            System.out.println(factorial(n));
        }
    }
}
