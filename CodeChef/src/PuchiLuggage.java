import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PuchiLuggage {
    private static void merge(int[] weight, int p, int q, int r, int[] frequency) {
        int nL = q - p + 1;
        int nR = r - q;
        int[] L = new int[nL];
        int[] R = new int[nR];
        for (int i = 0; i < nL; i++) {
            L[i] = weight[i + p];
        }
        for (int j = 0; j < nR; j++) {
            R[j] = weight[j + q + 1];
        }
        int i = 0, j = 0, k = p, count = 0;
        while (i < nL && j < nR) {
            if (L[i] <= R[j]) {
                weight[k] = L[i];
                frequency[L[i]] += count;
                i++;
            } else {
                weight[k] = R[j];
                count++;
                j++;
            }
            k++;
        }
        while (i < nL) {
            weight[k] = L[i];
            frequency[L[i]] += count;
            i++;
            k++;
        }
        while (j < nR) {
            weight[k] = R[j];
            j++;
            k++;
        }
    }

    private static void mergeSort(int[] weight, int p, int r, int[] frequency) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(weight, p, q, frequency);
            mergeSort(weight, q + 1, r, frequency);
            merge(weight, p, q, r, frequency);
        }
    }

    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(System.out);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = bufferedReader.readLine();
        String[] input = inputString.split("\\s+");
        int t = Integer.parseInt(input[0]);
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
            int[] weight = new int[n];
            int[] aux = new int[n];
            int[] frequency = new int[10000001];
            for (int j = 0; j < n; j++) {
                weight[j] = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
                aux[j] = weight[j];
            }
            mergeSort(weight, 0, n - 1, frequency);
            for (int j = 0; j < n; j++) {
                printWriter.print(frequency[aux[j]] + " ");
            }
            printWriter.println();
        }
        printWriter.close();
    }
}
