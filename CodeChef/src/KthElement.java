import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KthElement {
    private static int findKth(int[] L, int[] R, int k) {
        int l = L.length;
        int r = R.length;
        int i = 0, j = 0, c = 0;
        int[] sorted = new int[l + r];
        if (k > l + r || k == 0) return -1;
        else {
            while (i < l && j < r && c < k) {
                if (L[i] <= R[j]) {
                    sorted[c] = L[i];
                    i++;
                } else if (R[j] < L[i]) {
                    sorted[c] = R[j];
                    j++;
                }
                c++;
            }
            while (i < l && c < k) {
                sorted[c] = L[i];
                i++;
                c++;
            }
            while (j < r && c < k) {
                sorted[c] = R[j];
                j++;
                c++;
            }
            return sorted[c - 1];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bufferedReader.readLine().split("\\s+");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        String[] str1 = bufferedReader.readLine().split("\\s+");
        String[] str2 = bufferedReader.readLine().split("\\s+");
        int k = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(str1[i]);
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(str2[i]);
        }
        System.out.println(findKth(arr1, arr2, k));
    }
}
