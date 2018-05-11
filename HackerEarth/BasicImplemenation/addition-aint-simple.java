import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0) {
            String str=in.next();
            for (int i=0;i<str.length();i++) {
                int sum=str.charAt(i)+str.charAt(str.length()-i-1)-192;
                if (sum>26) sum-=26;
                System.out.printf("%c",(char)(sum+96));
            }
            System.out.println();
        }
    }
}