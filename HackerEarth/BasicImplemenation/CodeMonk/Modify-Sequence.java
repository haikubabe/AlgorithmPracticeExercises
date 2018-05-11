import java.io.PrintWriter;
import java.util.Scanner;

class TestClass {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);

        int N=in.nextInt();
        int[] arr = new int[N];
        int i=0;
        arr[i]=in.nextInt();
        for (int j=i+1;j<N;j++) {
            arr[j]=in.nextInt();
            if (arr[i]!=0) {
                arr[i]=arr[i]-1;
                arr[j]=arr[j]-1;
            }
            i=j;
            arr[i]=arr[j];
        }
        boolean possible=true;
        for (int k=0;k<N;k++) {
            if (arr[k]!=0) {
                possible=false;
                break;
            } else if (arr[k]==0)
                possible=true;
        }
        if (possible) out.println("YES");
        else out.println("NO");
    }
}