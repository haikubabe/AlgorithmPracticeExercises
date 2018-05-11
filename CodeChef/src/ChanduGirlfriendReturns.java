import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ChanduGirlfriendReturns {
    private static void merge(int[] arr1, int[] arr2, int[] finalArr, int n, int m) {
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] >= arr2[j]) {
                finalArr[k] = arr1[i];
                i++;
            } else {
                finalArr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            finalArr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < m) {
            finalArr[k] = arr2[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(System.out);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = bufferedReader.readLine();
        String[] input = inputString.split("\\s+");
        int t = Integer.parseInt(input[0]);
        for (int i = 0; i < t; i++) {
            String[] inputLine = bufferedReader.readLine().split("\\s+");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];
            String[] str1 = bufferedReader.readLine().split("\\s+");
            String[] str2 = bufferedReader.readLine().split("\\s+");
            for (int j = 0; j < n; j++) {
                arr1[j] = Integer.parseInt(str1[j]);
            }
            for (int j = 0; j < n; j++) {
                arr2[j] = Integer.parseInt(str2[j]);
            }
            int[] finalArr = new int[n + m];
            merge(arr1, arr2, finalArr, n, m);
            for (int j = 0; j < finalArr.length; j++) {
                printWriter.print(finalArr[j] + " ");
            }
            printWriter.println();
        }
        printWriter.close();
    }
}
