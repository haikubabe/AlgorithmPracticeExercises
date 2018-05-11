import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            int A= in.nextInt();
            int B= in.nextInt();
            int eat=1;
            String res="";
            while (true) {
                if (eat<=A) {
                    A-=eat;
                    res="Limak";
                    eat++;
                } else break;
                if (eat<=B) {
                    B-=eat;
                    res="Bob";
                    eat++;
                } else break;
            }
            System.out.println(res);
        }
    }
}