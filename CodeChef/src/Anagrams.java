import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Anagrams {
    private static void merge(char[] str, int low, int mid, int high) {
        int nL = mid - low + 1;
        int nR = high - mid;
        char[] L = new char[nL];
        char[] R = new char[nR];
        for (int i = 0; i < nL; i++) {
            L[i] = str[low + i];
        }
        for (int j = 0; j < nR; j++) {
            R[j] = str[mid + j + 1];
        }
        int i = 0, j = 0, k = low;
        while (i < nL && j < nR) {
            if (L[i] <= R[j]) {
                str[k] = L[i];
                i++;
            } else {
                str[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < nL) {
            str[k] = L[i];
            i++;
            k++;
        }
        while (j < nR) {
            str[k] = R[j];
            j++;
            k++;
        }
    }

    private static void mergeSort(char[] str, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(str, low, mid);
            mergeSort(str, mid + 1, high);
            merge(str, low, mid, high);
        }
    }

    private static boolean areAnagrams(String first, String second) {
        //sort the two strings
        char[] ch1 = first.toCharArray();
        char[] ch2 = second.toCharArray();
        mergeSort(ch1, 0, first.length() - 1);
        mergeSort(ch2, 0, second.length() - 1);
        return Arrays.equals(ch1, ch2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line1 = bufferedReader.readLine();
        String str1 = line1.split("\\s+")[0];
        String line2 = bufferedReader.readLine();
        String str2 = line2.split("\\s+")[0];
        if (areAnagrams(str1, str2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
