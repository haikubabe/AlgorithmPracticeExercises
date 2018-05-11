import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int k=0;k<N;k++) {
            String result = "";
            String str = in.next();
            int len = str.length();
            for (int i=0;i<len;i++) {
                if (str.charAt(i)==str.charAt(len-i-1)) {
                    if (len%2 == 0) {
                        result = "YES EVEN";
                    } else {
                        result = "YES ODD";
                    }
                } else {
                    result = "NO";
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
