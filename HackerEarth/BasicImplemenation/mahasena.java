import java.util.Scanner;
import java.util.Arrays;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        int lucky=0,unlucky=0;
        for (int i=0;i<N;i++){
            arr[i] = in.nextInt();
        }
        for (int j=0;j<N;j++) {
            if (arr[j]%2==0) {
                lucky++;
            } else {
                unlucky++;
            }
        }
        if (lucky>unlucky) System.out.println("READY FOR BATTLE");
        else System.out.println("NOT READY");
    }
}