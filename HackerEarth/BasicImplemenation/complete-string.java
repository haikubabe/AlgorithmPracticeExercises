import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        while (N-->0) {
            String str=in.next();
            int[] arr=new int[26];
            for (int i=0;i<str.length();i++) {
                arr[str.charAt(i)-97]++;
            }
            boolean flag=true;
            for (int i=0;i<26;i++) {
                if (arr[i]==0) {
                    flag=false;
                    break;
                }
            }
            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}