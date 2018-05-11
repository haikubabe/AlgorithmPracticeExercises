//first element as pivot node, sorted in decreasing order
class TestClass {
    static int partition(int[] arr, int p, int r) {
        int x = arr[p];
        int i = p;
        for (int j = p + 1; j <= r; j++) {
            if (arr[j] >= x) {
                i++;
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int temp = arr[p];
        arr[p] = arr[i];
        arr[i] = temp;
        return i;
    }

    static void quickSort(int[] arr, int p, int r) {
        if (p < r) {
            int q = partition(arr, p, r);
            quickSort(arr, p, q - 1);
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