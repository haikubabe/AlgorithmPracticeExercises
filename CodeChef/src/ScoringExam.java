import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ScoringExam {
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
        int i = 0, j = 0, k = p;
        while (i < nL && j < nR) {
            if (L[i] >= R[j]) {
                A[k] = L[i];
                i++;
            } else {
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
        int n = Integer.parseInt(input[0]);
        int q = Integer.parseInt(input[1]);
        int[] time = new int[n];
        int[] score = new int[n];
        String[] str1 = bufferedReader.readLine().split("\\s+");
        String[] str2 = bufferedReader.readLine().split("\\s+");
        for (int i = 0; i < n; i++) {
            time[i] = Integer.parseInt(str1[i]);
        }
        for (int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(str2[i]);
        }
        mergeSortDecreasing(time, 0, n - 1);
        for (int i = 0; i < q; i++) {
            int k = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
            int timeCount = 0;
            for (int j = 0; j < k; j++) {
                timeCount += time[j];
            }
            printWriter.println(timeCount);
        }
        printWriter.close();
    }
}
