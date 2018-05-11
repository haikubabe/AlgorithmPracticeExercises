public class SortNumbers {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[]{6, 4, 9, 2};
        int[] freq = new int[n+1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for (int i = 0; i < n+1; i++) {
            if (freq[i] == 1)
                System.out.print(i + " ");
        }
    }
}
