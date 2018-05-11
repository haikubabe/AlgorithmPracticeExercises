import java.io.*;

class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out, true);

        int T = Integer.parseInt(reader.readLine());
        for (int k = 0; k < T; k++) {
            String str=reader.readLine();
            int len=str.length();
            boolean res=true;
            for (int i=0;i<len;i++) {
                if (str.charAt(i)!=str.charAt(len-i-1)) {
                    res=false;
                    break;
                }
            }
            if (res)
                out.println("YES");
            else
                out.println("NO");
        }
    }
}