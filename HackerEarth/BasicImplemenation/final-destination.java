import java.util.Scanner;

class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String str=in.next();
        int a=0,b=0;
        for (int i=0;i<str.length();i++) {
            if (str.charAt(i)=='L') {
                a-=1;
            } else if (str.charAt(i)=='R') {
                a+=1;
            } else if (str.charAt(i)=='D') {
                b-=1;
            } else if (str.charAt(i)=='U') {
                b+=1;
            }
        }
        System.out.println(a+ " "+b);
    }
}