import java.util.Scanner;

class TestClass {
    static String decimalToBinary(int n) {
        String res = "";
        while (n != 0) {
            res += n % 2;
            n /= 2;
        }
        String rev = "";
        for (int i = 0; i < res.length(); i++) {
            rev += res.charAt(res.length() - i - 1);
        }
        return rev;
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int R = in.nextInt();
            int K = in.nextInt();
            int count=0;
            for (int i = 1; i <= R; i++) {
                int count101 = 0;
                String res = Integer.toBinaryString(i);
                int len = res.length();
                for (int j = 0; j < len; j++) {
                    if (j + 2 < len && res.charAt(j) == '1' && res.charAt(j + 1) == '0' && res.charAt(j + 2) == '1') {
                        count101++;
                    }
                }
                if (count101>=K) count++;
            }
            System.out.println(count);
        }
    }
}