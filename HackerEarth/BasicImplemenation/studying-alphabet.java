import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int len=S.length();
        int N = in.nextInt();
        for (int i=0;i<N;i++) {
            String W = in.next();
            int count=0;
            for (int j=0;j<W.length();j++) {
                for (int k=0;k<len;k++) {
                    if (W.charAt(j)==S.charAt(k)) {
                        count++;
                        break;
                    }
                }
            }
            if (count==W.length()) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}