import java.util.Scanner;

class TestClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int M=in.nextInt();
            long product=0,sum=0;
            for (int i=0;i<M;i++) {
                long len=in.nextLong();
                int d=in.nextInt();
                product=len*d;
                if(product == 0) sum+=product;
                else if(product%9 == 0) sum += 9;
                else sum += (product%9);

            }
            if (sum!=0) {
                if(sum%9 == 0) sum = 9;
                else sum = sum%9;
            }
            System.out.println(sum);
        }
    }
}