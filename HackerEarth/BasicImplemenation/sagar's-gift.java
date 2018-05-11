import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int N=in.nextInt();
            int arr[] = new int[10];
            for (int i=0;i<N;i++) {
                int num=in.nextInt();
                if (num==0) {
                    arr[0]++;
                } else {
                    while (num!=0) {
                        int rem=num%10;
                        arr[rem]++;
                        num/=10;
                    }
                }
            }
            String ans= "";
            for (int i=9;i>=0;i--) {
                for (int j=0;j<arr[i];j++) {
                    ans += (char)('0'+i);
                }
            }
            System.out.println(ans);
        }
    }
}