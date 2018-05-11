import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.next();
        int sum=0;
        for (int i=0;i<str.length();i++) {
            sum+=str.charAt(i)-96;
        }
        System.out.println(sum);
    }
}