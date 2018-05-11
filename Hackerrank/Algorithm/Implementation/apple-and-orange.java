import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        int[] orange = new int[n];
        int numApple = 0, numOrange = 0;
        for (int i=0;i<apple.length;i++) {
            apple[i] = in.nextInt();
        }
        for (int i=0;i<orange.length;i++) {
            orange[i] = in.nextInt();
        }
        for (int i=0;i<apple.length;i++) {
            if (a+apple[i] >= s && a+apple[i] <= t) {
                numApple++;
            }
        }
        for (int i=0;i<orange.length;i++) {
            if (b+orange[i] >= s && b+orange[i] <= t) {
                numOrange++;
            }
        }
        System.out.println(numApple);
        System.out.println(numOrange);
    }
}