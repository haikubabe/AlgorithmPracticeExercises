import java.util.Scanner;

class TestClass {
    static long gcd(long a,long b) {
        if(b>a){
            long t = b;
            b = a;
            a = t;
        }
        while(a%b!=0){
            long t = a%b;
            a = b;
            b = t;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            long A = in.nextLong();
            long B = in.nextLong();
            long gcd = gcd(A,B);
            long lcm = (A*B)/gcd;
            System.out.println(gcd + " " + lcm);
        }
    }
}