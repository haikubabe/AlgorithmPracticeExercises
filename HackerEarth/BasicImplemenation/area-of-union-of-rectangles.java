import java.util.Scanner;

class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int sum=0;
        while (N-->0) {
            int[] rect1=new int[4];
            int[] rect2=new int[4];
            int[] rect3=new int[4];
            for (int i=0;i<4;i++) {
                rect1[i]=in.next();
            }
            for (int i=0;i<4;i++) {
                rect2[i]=in.nextInt();
            }
            for (int i=0;i<4;i++) {
                rect3[i]=in.nextInt();
            }
        }
    }
}