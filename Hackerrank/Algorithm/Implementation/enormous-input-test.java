import java.util.Scanner;
import java.text.DecimalFormat;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        long K = in.nextLong();
        int count=0;
        for (int i=0;i<N;i++) {
            long t = in.nextLong();
            if (t%K == 0) count++;
        }
        System.out.println(count);
    }
}