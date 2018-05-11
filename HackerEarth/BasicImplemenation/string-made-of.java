import java.util.Scanner;
import java.util.HashMap;

class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String str=in.next();
        int[] arr=new int[10];
        arr[0]=arr[6]=arr[9]=6;
        arr[1]=2;
        arr[2]=arr[3]=arr[5]=5;
        arr[4]=4;
        arr[7]=3;
        arr[8]=7;
        int count=0;
        for (int i=0;i<str.length();i++) {
            int val=Character.getNumericValue(str.charAt(i));
            count+=arr[val];
        }
        System.out.println(count);
    }
}