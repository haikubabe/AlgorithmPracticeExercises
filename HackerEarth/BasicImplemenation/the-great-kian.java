import java.util.Scanner;

class TestClass {
    public static void main (String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        long[] arr = new long[num];
        int k=0;
        long a=0;
        for (int i=0;i<num;i++) {
            arr[i] = in.nextInt();
        }
        while (k<3) {
            for (int i=k;i<num;i=i+3) {
                if (i<num) {
                    a += arr[i];
                }
            }
            System.out.print(a + " ");
            a = 0;
            k++;
        }
    }
}