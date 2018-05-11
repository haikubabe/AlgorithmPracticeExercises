import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            long N=in.nextLong();
            long sum=0;
            long k3=(N-1)/3;
            long k5=(N-1)/5;
            long k15 = (N-1)/15;

            k3 = 3*k3*(k3+1)/2;
            k5 = 5*k5*(k5+1)/2;
            k15 = 15*k15*(k15+1)/2;
            sum = k3+k5-k15;

            System.out.println(sum);
        }
    }
}