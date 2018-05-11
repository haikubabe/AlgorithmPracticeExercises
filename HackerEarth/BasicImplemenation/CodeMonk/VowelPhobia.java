import java.io.*;

class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out, true);

        int T = Integer.parseInt(reader.readLine());
        for (int k = 0; k < T; k++) {
            String str=reader.readLine();
            int count=0;
            for (int i=0;i<str.length();i++) {
                char ch = str.charAt(i);
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    count++;
            }
            out.println(count);
        }
    }
}