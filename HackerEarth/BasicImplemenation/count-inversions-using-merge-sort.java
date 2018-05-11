class TestClass {
    static int merge_split_inversions(int[] arr, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] B = new int[n1];
        int[] C = new int[n2];
        for (int i = 0; i < n1; i++) {
            B[i] = arr[p + i];
        }
        for (int i = 0; i < n2; i++) {
            C[i] = arr[q + 1 + i];
        }
        int i = 0, j = 0, k = p;
        int totalSplitInversions = 0;
        while (i < n1 && j < n2) {
            if (B[i] <= C[j]) {
                arr[k] = B[i];
                i++;
                k++;
            } else if (C[j] <= B[i]) {
                arr[k] = C[j];
                totalSplitInversions += n1 - i;
                j++;
                k++;
            }
        }
        return totalSplitInversions;
    }

    static int sort_and_count(int[] arr, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            int leftInversions = sort_and_count(arr, p, q);
            int rightInversions = sort_and_count(arr, q + 1, r);
            int splitInversions = merge_split_inversions(arr, p, q, r);
            return (leftInversions + rightInversions + splitInversions);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 20, 6, 4, 5};
        int count = sort_and_count(arr, 0, arr.length - 1);
        System.out.println(count);
    }
}