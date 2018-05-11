import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            int N = in.nextInt();
            if (N<10) {
                System.out.println("What an obedient servant you are!");
            } else {
                System.out.println("-1");
            }
        }
    }
}