import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountInversion {
    private static long merge_split_inversions(int[] arr, int p, int q, int r) {
        int nL = q - p + 1;
        int nR = r - q;
        int[] L = new int[nL];
        int[] R = new int[nR];
        for (int i = 0; i < nL; i++) {
            L[i] = arr[p + i];
        }
        for (int i = 0; i < nR; i++) {
            R[i] = arr[q + 1 + i];
        }
        int i = 0, j = 0, k = p;
        long totalSplitInversions = 0;
        while (i < nL && j < nR) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else if (R[j] < L[i]) {
                arr[k] = R[j];
                totalSplitInversions = totalSplitInversions + (nL - i);
                j++;
            }
            k++;
        }
        while (i < nL) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < nR) {
            arr[k] = R[j];
            j++;
            k++;
        }
        return totalSplitInversions;
    }

    private static long sort_and_count(int[] arr, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            long left = sort_and_count(arr, p, q);
            long right = sort_and_count(arr, q + 1, r);
            long split = merge_split_inversions(arr, p, q, r);
            return left + right + split;
        } else {
            return 0;
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
        System.out.println(sort_and_count(arr, 0, n - 1));
    }
}