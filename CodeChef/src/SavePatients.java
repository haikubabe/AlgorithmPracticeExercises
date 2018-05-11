import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SavePatients {
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
        int n = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        int[] vaccine = new int[n];
        int[] patient = new int[n];
        String vaccineString = bufferedReader.readLine();
        String patientString = bufferedReader.readLine();
        for (int i = 0; i < n; i++) {
            vaccine[i] = Integer.parseInt(vaccineString.split("\\s+")[i]);
        }
        for (int i = 0; i < n; i++) {
            patient[i] = Integer.parseInt(patientString.split("\\s+")[i]);
        }
        sort(vaccine, n);
        sort(patient, n);
        boolean canSave = true;
        for (int i = 0; i < n; i++) {
            if (patient[i] > vaccine[i]) {
                canSave = false;
                break;
            }
        }
        if (canSave) System.out.println("Yes");
        else System.out.println("No");
    }
}
