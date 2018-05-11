import java.util.Scanner;

class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            String str = in.next();
            long len = str.length();
            long count = 0, totalSubstrings = (len * (len + 1)) / 2;
            for (int i = 0; i < len; i++) {
                for (int j = 1; j <= len - i; j++) {
                    String s = str.substring(i, i + j);
                    if (s.contains("a") || s.contains("z")) {
                        break;
                    } else {
                        count++;
                    }
                }
            }
            System.out.println(totalSubstrings-count);
        }
    }
}