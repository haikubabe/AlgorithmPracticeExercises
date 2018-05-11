import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            int N = in.nextInt();
            String str = in.next();
            int count = 0;
            boolean isPreviousDigit = false;
            for (int j = 0; j < N; j++) {
                if (str.charAt(j) >= 48 && str.charAt(j) <= 57) {
                    if (!isPreviousDigit == true) {
                        count++;
                        isPreviousDigit = true;
                    }
                } else {
                    isPreviousDigit = false;
                }
            }
            System.out.println(count);
        }
    }
}