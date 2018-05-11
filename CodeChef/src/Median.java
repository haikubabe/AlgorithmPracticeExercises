import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Median {
    private static void merge(int[] A, int[] B, int[] C) {
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
        String[] input = bufferedReader.readLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        String[] str1 = bufferedReader.readLine().split("\\s+");
        String[] str2 = bufferedReader.readLine().split("\\s+");
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(str1[i]);
        }
        for (int j = 0; j < m; j++) {
            arr2[j] = Integer.parseInt(str2[j]);
        }
        int len = n + m;
        int[] arr = new int[len];
        merge(arr1, arr2, arr);
        if (len % 2 != 0) {
            System.out.println(arr[arr.length / 2]);
        } else {
            int f = arr[arr.length / 2 - 1];
            int s = arr[arr.length / 2 ];
            System.out.println(f + " " + s);
            System.out.println((f+s)/2);
        }
    }
}
