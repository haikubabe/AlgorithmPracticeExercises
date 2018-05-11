import java.util.Scanner;

class TestClass {
    static boolean isPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        if (count == 2) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        int[] parray = new int[52];
        int k = 0, len = 0;
        for (int i = 65; i <= 122; i++) {
            if (isPrime(i)) {
                len++;
                while (true) {
                    parray[k] = i;
                    k++;
                    break;
                }
            }
        }

        while (T-- > 0) {
            int N = in.nextInt();
            String S = in.next();
            String res = "";
            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);
                int ascii = (int) c;
                if (isPrime(ascii)) {
                    res += c;
                } else {
                    if (ascii<=67) {
                        res+=(char)67;
                    } else if (ascii>=113) {
                        res+=(char)113;
                    } else {
                        for (int j = 0; j < len; j++) {
                            if (ascii<parray[j]) {
                                int diff1 = ascii - parray[j - 1];
                                int diff2 = parray[j] - ascii;
                                if (diff1 <= diff2) res += (char) parray[j - 1];
                                else res += (char) parray[j];
                                break;
                            }
                        }
                    }
                }
            }
            System.out.println(res);
        }
    }
}