public class Sort2 {
    public static void main (String[] args) {
        int n = 10;
        int[] arr = new int[]{6, 4, 9, 2, 5, 2, 10, 10};
        int[] freq = new int[n+1];
        for (int i=0;i<arr.length;i++) {
            freq[arr[i]]++;
        }
        for (int i=0;i<n+1;i++) {
            int count = freq[i];
            if (count>0) {
                for (int j=0;j<count;j++) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
