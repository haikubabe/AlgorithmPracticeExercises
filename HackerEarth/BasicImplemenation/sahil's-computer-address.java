import java.util.Scanner;

class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String[] str1 = str.split("\\.");
        if (str1.length > 4) {
            System.out.println("NO");
            return;
        }
        try {
            int a = Integer.parseInt(str1[0]);
            int b = Integer.parseInt(str1[1]);
            int c = Integer.parseInt(str1[2]);
            int d = Integer.parseInt(str1[3]);
            if (a > 255 || a < 0 || b > 255 || b < 0 || c > 255 || c < 0 || d > 255 || d < 0) {
                System.out.println("NO");
                return;
            }
        } catch (Exception exception) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }
}