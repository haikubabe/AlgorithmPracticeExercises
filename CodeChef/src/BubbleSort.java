import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {
    //return no. of swaps
    private static int sort(int[] arr, int n) {
        boolean swapped = true;
        int swapCount = 0;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                int j = i + 1;
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                    swapCount++;
                }
            }
            n = n - 1;
        }
        return swapCount;
    }

    //recursive bubble sort
    private static void bubbleSort(int[] arr, int n) {
        if (n == 1) return;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        bubbleSort(arr, n - 1);
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
//        System.out.println(sort(arr, n));
        bubbleSort(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
