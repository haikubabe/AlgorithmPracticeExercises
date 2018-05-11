import java.util.Arrays;
import java.io.*;

class TestClass {
    public static void main (String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out, true);
        int T=Integer.parseInt(reader.readLine());

        for (int i=0;i<T;i++) {
            int N=Integer.parseInt(reader.readLine());
            int[] arr = new int[N];
            String l[]=reader.readLine().split(" ");
            for (int j=0;j<N;j++) {
                arr[j]=Integer.parseInt(l[j]);
            }
            int min=Integer.MAX_VALUE;
            int count=0;
            for (int j=0;j<N;j++) {
                if (arr[j]<min) {
                    min=arr[j];
                    count=1;
                } else if (min==arr[j]) {
                    count++;
                }
            }
            if (count%2==1) out.println("Lucky");
            else out.println("Unlucky");
        }
    }
}