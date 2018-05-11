import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeArrays {
    private static void merge(int[] A, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = A[i + p];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = A[i + q + 1];
        }
        int i = 0, j = 0, k = p;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            A[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            A[k] = R[j];
            j++;
            k++;
        }
    }

    private static void mergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    private static void merging(int[] A, int[] B, int[] C) {
        int i = 0, j = 0, k = 0;
        while (i < A.length && j < B.length) {
            if (A[i] <= B[j]) {
                C[k] = A[i];
                i++;
            } else {
                C[k] = B[j];
                j++;
            }
            k++;
        }
        while (i < A.length) {
            C[k] = A[i];
            i++;
            k++;
        }
        while (j < B.length) {
            C[k] = B[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        for (int i = 0; i < t; i++) {
            String[] input = bufferedReader.readLine().split("\\s+");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            int[] arr = new int[n + m];
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];
            String[] str1 = bufferedReader.readLine().split("\\s+");
            String[] str2 = bufferedReader.readLine().split("\\s+");
            for (int j = 0; j < n; j++) {
                arr1[j] = Integer.parseInt(str1[j]);
            }
            for (int j = 0; j < m; j++) {
                arr2[j] = Integer.parseInt(str2[j]);
            }
            mergeSort(arr1, 0, n - 1);
            mergeSort(arr2, 0, m - 1);
            merging(arr1, arr2, arr);
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
