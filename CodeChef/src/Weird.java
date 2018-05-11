import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Weird {
    private static void sort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = bufferedReader.readLine();
        String[] input = inputString.split("\\s+");
        int n = Integer.parseInt(input[0]);
        int[] arr = new int[n];
        String[] arrayInput = bufferedReader.readLine().split("\\s+");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrayInput[i]);
        }
        int[] zombies = new int[n + 1];
        int[] vampires = new int[n + 1];
        int totalZ = 0, totalV = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                zombies[i] = arr[i];
                totalZ += arr[i];
            } else {
                vampires[i] = arr[i];
                totalV += arr[i];
            }
        }
        zombies[zombies.length - 1] = totalZ;
        vampires[vampires.length - 1] = totalV;

        sort(zombies, zombies.length);
        sort(vampires, vampires.length);

        for (int i = 0; i < zombies.length; i++) {
            if (zombies[i] != 0)
                System.out.print(zombies[i] + " ");
        }
        for (int i = 0; i < vampires.length; i++) {
            if (vampires[i] != 0)
                System.out.print(vampires[i] + " ");
        }
    }
}
