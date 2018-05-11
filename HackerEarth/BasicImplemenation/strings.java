import java.util.Scanner;

class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while (T-->0) {
            String N=in.next();
            String M=in.next();
            int val=N.compareTo(M);
//            System.out.println(val);
            if (val==1||val==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}