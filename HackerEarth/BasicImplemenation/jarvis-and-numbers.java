import java.util.Scanner;

class TestClass {

    static int hcf(int a,int b) {
        while (a%b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int N=in.nextInt();
            int sum=0;
            for (int i=2;i<N;i++) {
                int num=N;
                while (num>=i) {
                    sum+=num%i;
                    num=num/i;
                }
                sum+=num;
            }
            int count=N-1-2+1;
            int hcf=hcf(sum,count);
            System.out.println(count/hcf);
        }
    }
}