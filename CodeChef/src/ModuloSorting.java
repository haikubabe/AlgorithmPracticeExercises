import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ModuloSorting {
    private static void merge(int[] A, int p, int q, int r,int k) {
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
            if (L[i]%k <= R[j]%k) {
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

    private static void mergeSort(int[] A, int p, int r,int k) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(A, p, q,k);
            mergeSort(A, q + 1, r,k);
            merge(A, p, q, r,k);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = bufferedReader.readLine();
        String[] input = inputString.split("\\s+");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int[] arr = new int[n];
        String[] arrayInput = bufferedReader.readLine().split("\\s+");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrayInput[i]);
        }
        mergeSort(arr, 0, n - 1,k);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
