import java.util.Scanner;
import java.math.BigInteger;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            int N = in.nextInt();
            BigInteger f = new BigInteger("1");
            for (int j=2;j<=N;j++) {
                f = f.multiply(BigInteger.valueOf(j));
            }
            System.out.println(f);
        }
    }
}