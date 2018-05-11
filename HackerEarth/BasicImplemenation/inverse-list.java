import java.util.Scanner;

class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while (T-->0) {
            int N=in.nextInt();
            int[] org=new int[N];
            int[] arr=new int[N];
            boolean isEqual=true;
            for (int i=0;i<N;i++) {
                org[i]=in.nextInt();
                arr[org[i]-1]=i+1;
            }
            for (int i=0;i<N;i++) {
                if (org[i]!=arr[i]) {
                    isEqual=false;
                    break;
                }
            }
            if (isEqual) System.out.println("inverse");
            else System.out.println("not inverse");
        }
    }
}