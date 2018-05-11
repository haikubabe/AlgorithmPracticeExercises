import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-->0) {
            int N=in.nextInt();
            int X=in.nextInt();
            int[] arr=new int[N];
            for (int i=0;i<N;i++) {
                arr[i]=in.nextInt();
            }
            int sum=0,j=0;
            boolean flag=false;
            for (int i=0;i<N;i++) {
                sum=0;
                j=i;
                while (j<N&&sum<X) {
                    sum+=arr[j];
                    j++;
                    if (sum==X) {
                        flag=true;
                        break;
                    }
                }
                if (flag) break;
            }
            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}