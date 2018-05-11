import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Easy {
    private static void merge(String[] A, int p, int q, int r) {
        int nL = q - p + 1;
        int nR = r - q;
        String[] L = new String[nL];
        String[] R = new String[nR];
        for (int i = 0; i < nL; i++) {
            L[i] = A[i + p];
        }
        for (int j = 0; j < nR; j++) {
            R[j] = A[j + q + 1];
        }
        int i = 0, j = 0, k = p;
        while (i < nL && j < nR) {
            if (L[i].length() <= R[j].length()) {
                A[k] = L[i];
                i++;
            } else if (R[j].length() < L[i].length()) {
                A[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < nL) {
            A[k] = L[i];
            i++;
            k++;
        }
        while (j < nR) {
            A[k] = R[j];
            j++;
            k++;
        }
    }

    private static void mergeSort(String[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = bufferedReader.readLine();
        String[] input = inputString.split("\\s+");
        int n = Integer.parseInt(input[0]);
        for (int i = 0; i < n; i++) {
            String[] arrayInput = bufferedReader.readLine().split("\\s+");
            mergeSort(arrayInput, 0, arrayInput.length- 1);
            for (int j = 0; j < arrayInput.length; j++) {
                System.out.print(arrayInput[j] + " ");
            }
            System.out.println();
        }
    }
}
