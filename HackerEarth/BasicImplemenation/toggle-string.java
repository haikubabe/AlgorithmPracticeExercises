import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.next();
        String res="";
        for (int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if (Character.isUpperCase(ch)) {
                ch=Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                ch=Character.toUpperCase(ch);
            }
            res+=ch;
        }
        System.out.println(res);
    }
}