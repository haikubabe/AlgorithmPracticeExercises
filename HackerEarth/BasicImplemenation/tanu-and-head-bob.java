import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            int N=in.nextInt();
            String str = in.next();
            boolean flag=true;
            for (int j=0;j<N;j++) {
                if (str.charAt(j) == 'Y') {
                    System.out.println("NOT INDIAN");
                    flag=false;
                    break;
                } else if (str.charAt(j) == 'I') {
                    System.out.println("INDIAN");
                    flag=false;
                    break;
                } else if (str.charAt(j) == 'N') {
                    continue;
                }
            }
            if (flag) {
                System.out.println("NOT SURE");
            }
        }
    }
}