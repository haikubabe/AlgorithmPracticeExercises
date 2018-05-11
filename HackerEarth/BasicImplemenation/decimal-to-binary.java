import java.util.Scanner;

class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        String str=Integer.toBinaryString(num);
        int index=str.indexOf("101");
        int index1=str.indexOf("101",index);
        System.out.println(str+" "+index+" "+index1);
    }
}