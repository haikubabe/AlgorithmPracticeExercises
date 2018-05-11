import java.io.*;

class TestClass {
    static void print(String s) {
        char ch[] = s.toCharArray();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (ch[i] == '/') {
                if (ch[i + 1] == '/' && i + 1 < len) {
                    while (i < len) {
                        System.out.print(ch[i]);
                        i++;
                    }
                    System.out.println();
                    return;
                } else {
                    System.out.print(ch[i]);
                }
            } else if (ch[i] == '-') {
                if (i + 1 < len && ch[i + 1] == '>') {
                    System.out.print(".");
                    i++;
                } else {
                    System.out.print(ch[i]);
                }
            } else {
                System.out.print(ch[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        while (line != null) {
            print(line);
            line = reader.readLine();
        }
    }
}