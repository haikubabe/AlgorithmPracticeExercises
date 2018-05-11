import java.util.Scanner;

class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int found = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int min = arr[0], max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
            if (arr[i] >= max) {
                max = arr[i];
            }
        }

        for (int i = min; i <= max; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] != i) {
                    continue;
                } else {
                    found++;
                    break;
                }
            }
        }
        if (found == max) System.out.println("YES");
        else System.out.println("NO");
    }
}