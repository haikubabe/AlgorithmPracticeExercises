import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            long sum=0;
            long L = in.nextLong();
            long R = in.nextLong();
            long j=L;
            while(j<=R) {
                long temp = j;
                long rev = 0;
                while (temp!=0) {
                    long rem = temp%10;
                    rev = rev*10+rem;
                    temp = temp/10;
                }
                if (rev == j) {
                    sum += j;
                }
                j++;
            }
            System.out.println(sum);
        }
    }
}