import java.util.Scanner;

public class UVa100 {
    private static int findCycleLength(int num) {
        int cycleLength = 0;
        while (num > 0) {
            cycleLength++;
            if (num == 1) break;
            if (num % 2 == 1)
                num = 3 * num + 1;
            else
                num = num / 2;
        }
        return cycleLength;
    }

    private static int findMaxCycleLength(int min, int max) {
        int maxCycleLength = 0;
        for (int i = min; i <= max; i++) {
            int count = findCycleLength(i);
            if (count > maxCycleLength)
                maxCycleLength = count;
        }
        return maxCycleLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int min = Math.min(a, b);
            int max = Math.max(a, b);
            System.out.println(a + " " + b + " " + findMaxCycleLength(min, max));
        }
    }
}
