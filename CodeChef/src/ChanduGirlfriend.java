import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ChanduGirlfriend {
    private static void merge(int[] A, int p, int q, int r) {
        int nL = q - p + 1;
        int nR = r - q;
        int[] L = new int[nL];
        int[] R = new int[nR];
        for (int i = 0; i < nL; i++) {
            L[i] = A[i + p];
        }
        for (int j = 0; j < nR; j++) {
            R[j] = A[j + q + 1];
        }
        int i = 0, j = 0, l = p;
        while (i < nL && j < nR) {
            if (L[i] >= R[j]) {
                A[l] = L[i];
                i++;
            } else {
                A[l] = R[j];
                j++;
            }
            l++;
        }
        while (i < nL) {
            A[l] = L[i];
            i++;
            l++;
        }
        while (j < nR) {
            A[l] = R[j];
            j++;
            l++;
        }
    }

    private static void mergeSortDecreasing(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSortDecreasing(A, p, q);
            mergeSortDecreasing(A, q + 1, r);
            merge(A, p, q, r);
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
            String[] inputLine = bufferedReader.readLine().split("\\s+");
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(inputLine[j]);
            }
            mergeSortDecreasing(arr, 0, n - 1);
            for (int j = 0; j < n; j++) {
                printWriter.print(arr[j] + " ");
            }
            printWriter.println();
        }
        printWriter.close();
    }
}
