import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String str = in.next();
        int counth = 0, counta = 0, countc = 0, countk = 0, counte = 0, countr = 0, countt = 0, ans = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case 'h':
                    counth++;
                    break;
                case 'a':
                    counta++;
                    break;
                case 'c':
                    countc++;
                    break;
                case 'k':
                    countk++;
                    break;
                case 'e':
                    counte++;
                    break;
                case 'r':
                    countr++;
                    break;
                case 't':
                    countt++;
                    break;
                default:
                    break;
            }
        }
        while (counth >= 2 && counta >= 2 && countc >= 1 && countk >= 1 && counte >= 2 && countr >= 2 && countt >= 1) {
            counth -= 2;
            counta -= 2;
            countc -= 1;
            countk -= 1;
            counte -= 2;
            countr -= 2;
            countt -= 1;
            ans++;
        }
        System.out.println(ans);
    }
}