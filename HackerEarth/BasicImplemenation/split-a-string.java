import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        String[] splitStr = str.split("\\s+");
        for (String s:splitStr) {
            System.out.println(s);
        }
    }
}