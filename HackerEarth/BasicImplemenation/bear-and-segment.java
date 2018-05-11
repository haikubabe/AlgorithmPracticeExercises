import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            String str = in.next();
            int len = str.length();
            int count=0,c=0,max=0;
            for (int j=0;j<len;j++) {
                if (str.charAt(j)=='1') {
                    count++;
                    c++;
                } else {
                    c=0;
                }
                if (c>max) max=c;
            }
            if (count!=0&&count==max) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}