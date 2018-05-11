import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            int N=in.nextInt();
            int[] arr = new int[N];
            boolean fail=false;
            boolean fullScore=false;
            for (int j=0;j<N;j++) {
                arr[j] = in.nextInt();
            }
            double average=0;
            int sum=0;
            for (int k=0;k<N;k++) {
                if (arr[k]<=2) {
                    fail=true;
                    break;
                } else {
                    if (arr[k]==5) {
                        fullScore=true;
                    }
                    sum+=arr[k];
                }
            }
            if (fail) System.out.println("No");
            else {
                average = (double) sum/N;
                if (average>=4 && fullScore) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}