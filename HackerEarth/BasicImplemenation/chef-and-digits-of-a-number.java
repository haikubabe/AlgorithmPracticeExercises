import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            String str = in.next();
            int countOne=0,countZero=0;
            for (int j=0;j<str.length();j++) {
                if (str.charAt(j)=='1') countOne++;
                else if (str.charAt(j)=='0') countZero++;
            }
            if (countOne==1||countZero==1) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}