import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            String str=in.next();
            int count=0;
            for (int j=0;j<str.length();j++) {
                if (str.charAt(j) == '4') count++;
            }
            System.out.println(count);
        }
    }
}