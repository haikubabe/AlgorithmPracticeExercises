import java.util.Scanner;

class TestClass {
    static int reverse(int n) {
        int ans=0;
        while (n!=0) {
            ans=(ans*10)+(n%10);
            n/=10;
        }
        return ans;
    }
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while (T-->0) {
            int A=in.nextInt();
            int B=in.nextInt();
            int sum=reverse(A)+reverse(B);
            System.out.println(reverse(sum));
        }
    }
}