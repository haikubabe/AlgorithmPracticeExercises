import java.io.*;

class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out, true);

        int T = Integer.parseInt(reader.readLine());
        for (int k = 0; k < T; k++) {
            boolean res = true;
            int N = Integer.parseInt(reader.readLine());
            String str = reader.readLine();
            char ch[]=str.toCharArray();
            for (int i = 0; i < N; i++) {
                if (ch[i] == 'A')
                    ch[i] = 'T';
                else if (ch[i] == 'T')
                    ch[i] = 'A';
                else if (ch[i] == 'G')
                    ch[i] = 'C';
                else if (ch[i] == 'C')
                    ch[i] = 'G';
                else {
                    res = false;
                    break;
                }
            }
            String str1 = new String(ch);
            if (res) {
                out.println(str1);
            } else {
                out.println("Error RNA nucleobases found!");
            }
        }
    }
}