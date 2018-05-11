import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int Q=in.nextInt();
        int[] arr=new int[N];
        int[] b = new int[Q];
        boolean flag=false;
        for (int i=0;i<N;i++) {
            arr[i]=in.nextInt();
        }
        for (int k=0;k<Q;k++) {
            b[k] = in.nextInt();
        }
        int min=arr[0],max=arr[0];
        for (int j=0;j<N;j++) {
            if (arr[j]<min) {
                min=arr[j];
            }
            if (arr[j]>max) {
                max=arr[j];
            }
        }
        for (int m=0;m<Q;m++) {
            if (b[m]>=min&&b[m]<=max) {
                System.out.println("Yes");
            } else System.out.println("No");
        }
    }
}