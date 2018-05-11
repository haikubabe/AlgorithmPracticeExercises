import java.util.Scanner;

class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while (T-->0) {
            int N=in.nextInt();
            int M=in.nextInt();
            int D=in.nextInt();
            int[] x1=new int[N];
            int[] y1=new int[N];
            for (int i=0;i<N;i++) {
                x1[i]=in.nextInt();
                y1[i]=in.nextInt();
            }
            int count=0;
            for (int i=0;i<M;i++) {
                int X2=in.nextInt();
                int Y2=in.nextInt();
                for (int j=0;j<N;j++) {
                    int manhattanDist=Math.abs(x1[j]-X2)+Math.abs(y1[j]-Y2);
                    if (manhattanDist<=D) {
                        count++;
                        break;
                    }
                }
            }
            if (count>M/2) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}