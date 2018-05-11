import java.util.Scanner;

class TestClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        char[] str1 = in.next().toCharArray();
        char[] str2 = in.next().toCharArray();
        int[] A=new int[N];
        int[] B=new int[N];
        boolean flag=true;
        for (int i=0;i<N;i++) {
            A[str1[i]-97]++;
            B[str2[i]-97]++;
        }
        for (int i=0;i<N;i++) {
            if (A[i]!=B[i]) {
                flag=false;
                break;
            }
        }
        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }
}