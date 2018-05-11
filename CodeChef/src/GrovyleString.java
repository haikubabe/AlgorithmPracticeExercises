import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GrovyleString {
    private static int partition(String A, int p, int r) {
        Character x = A.charAt(r);
        int i = p - 1;
        for (int j = p; j < r; j++) {
            Character c = A.charAt(j);
            if (c.compareTo(x) <= 0) {
                i = i + 1;
                char temp = A.charAt(i);
                A.charAt(i) = A.charAt(j);
                A[j] = temp;
            }
        }
        i = i + 1;
        String temp = A[i];
        A[i] = A[r];
        A[r] = temp;
        return i;
    }

    private static void quicksort(String A, int p, int r) {
        if (p < r) {
            int q = partition(A, p, r);
            quicksort(A, p, q - 1);
            quicksort(A, q + 1, r);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = bufferedReader.readLine().split("\\s+")[0];
            int start = 0, end = arr[i].length()-1;
            int middle = (start+end)/2;
            int X=0;
            String str = arr[i];
            for (int j=start;j<=end;j++) {
                X += Math.abs(str.charAt(j)-str.charAt(middle)) * str.charAt(j);
            }
            System.out.println(X);
            quicksort(str, 0, n - 1);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
