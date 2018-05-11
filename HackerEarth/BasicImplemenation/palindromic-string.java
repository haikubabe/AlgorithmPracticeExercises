import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.next();
        int len=str.length();
        boolean val=false;
        for (int i=0;i<len;i++) {
            if (str.charAt(i)==str.charAt(len-i-1)) {
                val=true;
            } else {
                val=false;
                break;
            }
        }
        if (val) System.out.println("YES");
        else System.out.println("NO");
    }
}