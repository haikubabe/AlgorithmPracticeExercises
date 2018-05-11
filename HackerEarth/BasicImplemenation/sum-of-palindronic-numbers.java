import java.util.Scanner;

class TestClass {
    static boolean palindrome(long num) {
        boolean isPalindrome = true;
        String str = String.valueOf(num);
        if (str.length() == 1) isPalindrome = true;
        else {
            for (int i=0;i<str.length()/2;i++) {
                if (str.charAt(i) == str.charAt(str.length()-i-1)) {
                    isPalindrome = true;
                } else {
                    isPalindrome = false;
                    break;
                }
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            long sum=0;
            long L = in.nextLong();
            long R = in.nextLong();
            for (long j=L;j<=R;j++) {
                boolean isPalindrome = palindrome(j);
                if (isPalindrome) {
                    sum += j;
                }
            }
            System.out.println(sum);
        }
    }
}