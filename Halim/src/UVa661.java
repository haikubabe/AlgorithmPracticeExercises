import java.util.Arrays;
import java.util.Scanner;

public class UVa661 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sequence = 0;
        while (scanner.hasNext()) {
            sequence++;
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int c = scanner.nextInt();
            if (n == 0 && m == 0 && c == 0) break;
            int[] devices = new int[n];
            int[] toggleStates = new int[n];
            Arrays.fill(toggleStates, 0);
            for (int i = 0; i < n; i++) {
                int consumption = scanner.nextInt();
                devices[i] = consumption;
            }
            int powerConsumption = 0, maxPower = 0;
            boolean fuseBlown = false;
            int[] toggleStateNos = new int[m];
            for (int i = 0; i < m; i++) {
                toggleStateNos[i] = scanner.nextInt();
            }
            for (int i = 0; i < m; i++) {
                int toggleDeviceNo = toggleStateNos[i];
                if (toggleStates[toggleDeviceNo - 1] == 0) {
                    toggleStates[toggleDeviceNo - 1] = 1;
                    powerConsumption += devices[toggleDeviceNo - 1];
                } else if (toggleStates[toggleDeviceNo - 1] == 1) {
                    toggleStates[toggleDeviceNo - 1] = 0;
                    powerConsumption -= devices[toggleDeviceNo - 1];
                }
                if (powerConsumption > c) {
                    fuseBlown = true;
                    break;
                }
                if (powerConsumption > maxPower)
                    maxPower = powerConsumption;
            }
            if (fuseBlown) {
                System.out.println("Sequence " + sequence);
                System.out.println("Fuse was blown.");
            } else {
                System.out.println("Sequence " + sequence);
                System.out.println("Fuse was not blown.");
                System.out.println("Maximal power consumption was " + maxPower + " amperes.");
            }
            System.out.println();
        }
    }
}
