import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int len = str.length();
        boolean flag = true;
        for (int i = 0; i < len - 6; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2) && str.charAt(i) == str.charAt(i + 3) && str.charAt(i) == str.charAt(i + 4) && str.charAt(i) == str.charAt(i + 5)) {
                flag=false;
            }
        }
        if (flag) System.out.println("Good luck!");
        else System.out.println("Sorry, sorry!");
    }
}