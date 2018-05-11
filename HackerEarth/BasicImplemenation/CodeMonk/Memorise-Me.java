import java.io.*;
import java.util.Arrays;

class TestClass {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[] arr=new int[100000];
        int[] c = new int[100000];
        Arrays.fill(c,0);
        String l[]=reader.readLine().split(" ");
        for (int i=0;i<N;i++) {
            arr[i]=Integer.parseInt(l[i]);
            c[arr[i]]++;
        }

        PrintWriter out = new PrintWriter(System.out, true);
        int Q=Integer.parseInt(reader.readLine());
        for (int i=0;i<Q;i++) {
            int val=Integer.parseInt(reader.readLine());
            if (c[val]==0) out.println("NOT PRESENT");
            else out.println(c[val]);
        }
    }
}