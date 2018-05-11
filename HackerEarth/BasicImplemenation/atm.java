import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        double Y = in.nextDouble();
        if (X%5 == 0) {
            if ((X+0.5)<=Y) {
                System.out.printf("%.2f\n", Y-(X+0.5));
            } else {
                System.out.printf("%.2f\n", Y);
            }
        } else {
            System.out.printf("%.2f\n", Y);
        }
    }
}