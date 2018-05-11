import java.util.Scanner;

class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int N = in.nextInt();
            int Q = in.nextInt();
            char[] str = in.next().toCharArray();
            for (int i = 0; i < Q; i++) {
                int L = in.nextInt();
                int R = in.nextInt();
                L -= 1;
                for (int j = L; j < R; j++) {
                    char ch = str[j];
                    if (ch == 'a') {
                        str[j] = 'z';
                    } else {
                        str[j] = (char) (str[j] - 1);
                    }
                }
            }
            System.out.println(str);
        }
    }
}