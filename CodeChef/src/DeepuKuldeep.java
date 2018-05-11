import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeepuKuldeep {
    private static void merge(long[] frequency, int p, int q, int r) {
        int nL = q - p + 1;
        int nR = r - q;
        long[] L = new long[nL];
        long[] R = new long[nR];
        for (int i = 0; i < nL; i++) {
            L[i] = frequency[i + p];
        }
        for (int j = 0; j < nR; j++) {
            R[j] = frequency[j + q + 1];
        }
        int i = 0, j = 0, k = p;
        while (i < nL && j < nR) {
            if (L[i] >= R[j]) {
                frequency[k] = L[i];
                i++;
            } else {
                frequency[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < nL) {
            frequency[k] = L[i];
            i++;
            k++;
        }
        while (j < nR) {
            frequency[k] = R[j];
            j++;
            k++;
        }
    }

    private static void mergeSort(long[] frequency, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(frequency, p, q);
            mergeSort(frequency, q + 1, r);
            merge(frequency, p, q, r);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = bufferedReader.readLine();
        String[] input = inputString.split("\\s+");
        int t = Integer.parseInt(input[0]);
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
            int[] arr = new int[n];
            long[] frequency = new long[10000000001];
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
                frequency[arr[j]]++;
            }
            mergeSort(frequency, 0, 1000000000);
            System.out.println(frequency[0]);
        }
    }
}
