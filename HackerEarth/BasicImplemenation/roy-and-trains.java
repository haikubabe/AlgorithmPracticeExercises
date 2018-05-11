import java.util.Scanner;

class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int T0 = in.nextInt();
            int T1 = in.nextInt();
            int T2 = in.nextInt();
            int V1 = in.nextInt();
            int V2 = in.nextInt();
            int D = in.nextInt();
            int min = -1;
            int firstTime = 0, secondTime = 0;
            if (T1 >= T0) {
                double time1 = 60 * ((double)D/(double)V1);
                firstTime = (int) Math.ceil(time1);
                min = firstTime + T1;
            }
            if (T2 >= T0) {
                double time2 = 60 * ((double)D/(double)V2);
                secondTime = (int) Math.ceil(time2);
                if (min == -1 || min > (secondTime + T2))
                    min = secondTime + T2;
            }
            System.out.println(min);
        }
    }
}