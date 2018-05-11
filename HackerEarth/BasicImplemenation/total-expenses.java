import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            double quantity = in.nextInt();
            double price = in.nextInt();
            if (quantity > 1000) {
                quantity = (quantity*9)/10;
            }
            double result = quantity*price;
            System.out.printf("%.6f\n", result);
        }
    }
}