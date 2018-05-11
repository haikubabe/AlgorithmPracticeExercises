import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertionSort {
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
        int[] out = new int[n];
        int[] inp = new int[n];
        String[] arrayInput = bufferedReader.readLine().split("\\s+");
        for (int i = 0; i < n; i++) {
            out[i] = Integer.parseInt(arrayInput[i]);
            inp[i] = out[i];
        }
        sort(out, n);
        for (int i = 0; i < inp.length; i++) {
            for (int j = 0; j < out.length; j++) {
                if (inp[i] == out[j]) {
                    System.out.print(j + 1 + " ");
                    break;
                }
            }
        }
    }
}
