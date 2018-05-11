import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuickSort {
    //pivot element is the last element
    private static int partition(int[] A, int p, int r) {
        int x = A[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (A[j] <= x) {
                i = i + 1;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        i = i + 1;
        int temp = A[i];
        A[i] = A[r];
        A[r] = temp;
        return i;
    }

    //pivot element is the first element
    private static int firstPartition(int[] A, int p, int r) {
        int x = A[p];
        int i = p;
        for (int j = p + 1; j <= r; j++) {
            if (A[j] <= x) {
                i = i + 1;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i];
        A[i] = A[p];
        A[p] = temp;
        return i;
    }

    private static void quicksort(int[] A, int p, int r) {
        if (p < r) {
            int q = firstPartition(A, p, r);
            quicksort(A, p, q - 1);
            quicksort(A, q + 1, r);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        int[] arr = new int[n];
        String[] line = bufferedReader.readLine().split("\\s+");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }
        quicksort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
