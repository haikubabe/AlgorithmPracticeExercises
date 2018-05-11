import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringSort {
    public static void sort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min]) < 0)
                    min = j;
            }
            if (min != i) {
                String temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = bufferedReader.readLine();
        String[] input = inputString.split("\\s+");
        int n = Integer.parseInt(input[0]);
        String[] arr = new String[n];
        String[] arrayInput = bufferedReader.readLine().split("\\s+");
        for (int i = 0; i < n; i++) {
            arr[i] = arrayInput[i];
        }
        sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
