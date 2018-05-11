import java.util.Scanner;

class TestClass {
    static boolean isPrime(String str) {
        boolean prime = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1))
                prime=true;
            else {
                prime=false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            String str = in.next();
            long product = 1;
            if (isPrime(str)) {
                System.out.println("Palindrome");
            } else {
                char[] strArr = str.toCharArray();
                int[] arr = new int[26];
                for (char s : strArr) {
                    product*=(s - 96);
                }
                System.out.println(product);
            }
        }
    }
}