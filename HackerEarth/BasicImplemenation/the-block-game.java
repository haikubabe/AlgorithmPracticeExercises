import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            int N=in.nextInt();
            int reverse=0;
            int temp=N;
            while(temp!=0) {
                reverse = reverse*10+temp%10;
                temp = temp/10;
            }
            if (N==reverse) {
                System.out.println("wins");
            } else {
                System.out.println("losses");
            }
        }
    }
}