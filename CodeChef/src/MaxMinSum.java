import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxMinSum {
    private static void sort(int[] arr, int n) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                int j = i + 1;
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            n = n - 1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        for (int k = 0; k < t; k++) {
            String inputString = bufferedReader.readLine();
            String[] str = inputString.split("\\s+");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            int num = n - m;
            int[] arr = new int[n];
            String[] arrayInput = bufferedReader.readLine().split("\\s+");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(arrayInput[i]);
            }
            sort(arr, n);
            int maxSum = 0, minSum = 0;
            for (int i = 0; i < num && num <= n; i++) {
                minSum += arr[i];
                maxSum += arr[n - i - 1];
            }
            System.out.println(maxSum - minSum);
        }
    }
}
