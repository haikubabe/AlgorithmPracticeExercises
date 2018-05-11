//middle element as pivot node, sorted in increasing order
class TestClass {
    static int partitionLast(int[] arr, int p, int r) {
        int q = (p + r) / 2;
        int temp = arr[q];
        arr[q] = arr[r];
        arr[r] = temp;
        int x = arr[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (arr[j] <= x) {
                i++;
                if (i != j) {
                    int t1 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t1;
                }
            }
        }
        int t = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = t;
        return i + 1;
    }

    static int partitionFirst(int[] arr, int p, int r) {
        int q = (p + r) / 2;
        int temp = arr[q];
        arr[q] = arr[p];
        arr[p] = temp;
        int x = arr[p];
        int i = p;
        for (int j = p + 1; j <= r; j++) {
            if (arr[j] <= x) {
                i++;
                if (i != j) {
                    int t1 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t1;
                }
            }
        }
        int t = arr[p];
        arr[p] = arr[i];
        arr[i] = t;
        return i;
    }

    static void quickSort(int[] arr, int p, int r) {
        if (p < r) {
//            int q = partitionLast(arr, p, r);
            int q = partitionFirst(arr, p, r);
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