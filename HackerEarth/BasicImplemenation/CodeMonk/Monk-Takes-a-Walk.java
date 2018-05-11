import java.io.*;

class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out, true);

        int T = Integer.parseInt(reader.readLine());
        for (int k = 0; k < T; k++) {
            String str=reader.readLine();
            int len=str.length();
            int count=0;
            for (int i=0;i<len;i++) {
                char ch=str.charAt(i);
                if (ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
                    count++;
            }
            out.println(count);
        }
    }
}