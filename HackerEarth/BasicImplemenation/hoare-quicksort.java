class TestClass {
    static int hoarePartition(int[] arr, int p, int r) {
        int x = arr[p];
        int i = p - 1;
        int j = r + 1;
        while (true) {
            /*//decreasing sort
            do {
                j--;
            } while (arr[j] < x);

            do {
                i++;
            } while (arr[i] > x);*/

            //increasing sort
            do {
                j--;
            } while (arr[j] > x);

            do {
                i++;
            } while (arr[i] < x);

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else {
                return j;
            }
        }
    }

    static void quickSort(int[] arr, int p, int r) {
        if (p < r) {
            int q = hoarePartition(arr, p, r);
            quickSort(arr, p, q);
            quickSort(arr, q + 1, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 19, 13, 9, 5, 12, 8, 7, 4, 11, 2, 6, 21};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}