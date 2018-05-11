import java.util.Scanner;

class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int A=in.nextInt();
            int N=in.nextInt();
            int[] arr=new int[N];
            for (int i=0;i<N;i++) {
                arr[i]=in.nextInt();
            }
            boolean flag=true;
            int temp=0;
            for (int i=0;i<N;i++) {
                if (arr[i]==0) {
                    A-=1;
                } else {
                    A+=3-1;
                }
                if (A==0&&i<N-1) {
                    flag=false;
                    temp=i;
                    break;
                }
            }
            if (flag) {
                System.out.println("Yes "+A);
            } else {
                System.out.println("No "+(temp+1));
            }
        }
    }
}