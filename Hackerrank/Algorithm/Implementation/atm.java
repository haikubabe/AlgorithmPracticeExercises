import java.util.Scanner;
import java.text.DecimalFormat;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        DecimalFormat df = new DecimalFormat("#.00");
        double Y = Double.parseDouble(df.format(in.nextDouble()));
        double balance = 0;
        if (X%5 == 0) {
            balance = Y-X;
        }
        System.out.println(balance);
    }
}