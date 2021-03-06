//last element as pivot node, sorted in decreasing order
class TestClass {
    static int partition(int[] arr, int p, int r) {
        int x = arr[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (arr[j] >= x) {
                i++;
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;
        return i + 1;
    }

    static void quickSortDecreasing(int[] arr, int p, int r) {
        if (p < r) {
            int q = partition(arr, p, r);
            quickSortDecreasing(arr, p, q - 1);
            quickSortDecreasing(arr, q + 1, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 13, 19, 9, 5, 12, 8, 7, 4, 11, 2, 6, 21};
        quickSortDecreasing(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}