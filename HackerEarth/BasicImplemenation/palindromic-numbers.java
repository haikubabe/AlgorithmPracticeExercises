import java.util.Scanner;

class TestClass {
    static boolean isPalindrome(int num) {
        int rev=0;
        int temp=num;
        while (temp!=0) {
            rev=(rev*10)+(temp%10);
            temp/=10;
        }
        if (rev==num) return true;
        else return false;
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while (T-->0) {
            int A=in.nextInt();
            int B=in.nextInt();
            int count=0;
            for (int i=A;i<=B;i++) {
                if (isPalindrome(i)) count++;
            }
            System.out.println(count);
        }
    }
}