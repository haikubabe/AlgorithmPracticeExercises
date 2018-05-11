import java.io.*;
import java.util.Arrays;

class TestClass {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out, true);

        int T=Integer.parseInt(reader.readLine());
        for (int i=0;i<T;i++) {
            String s[] = reader.readLine().split(" ");
            String str = s[0];
            int N = Integer.parseInt(s[1]);
            int M = Integer.parseInt(s[2]);
            for (int j=0;j<N;j++) {
                out.print(str.charAt(j));
            }
            String str1 = str.substring(N,M+1);
            char b[] = str1.toCharArray();
            Arrays.sort(b);
            for (int j=b.length-1;j>=0;j--) {
                out.print(b[j]);
            }
            for (int j=M+1;j<str.length();j++) {
                out.print(str.charAt(j));
            }
            out.println();
        }
    }
}