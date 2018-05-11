import java.io.IOException;

public class Heap {
    private static int left(int i) {
        return 2 * i + 1;
    }

    private static int right(int i) {
        return 2 * i + 2;
    }

    private static void max_heapify(int[] A, int i) {
        int l = left(i);
        int r = right(i);
        int largest;
        if (l < A.length && A[l] > A[i])
            largest = l;
        else
            largest = i;
        if (r < A.length && A[r] > A[largest])
            largest = r;
        if (largest != i) {
            int temp = A[largest];
            A[largest] = A[i];
            A[i] = temp;
            max_heapify(A, largest);
        }
    }

    private static void iterative_max_heapify(int[] A, int i) {
        while (true) {
            int l = left(i);
            int r = right(i);
            int largest;
            if (l < A.length && A[l] > A[i])
                largest = l;
            else
                largest = i;
            if (r < A.length && A[r] > A[largest])
                largest = r;
            if (largest != i) {
                int temp = A[largest];
                A[largest] = A[i];
                A[i] = temp;
                i = largest;
            } else {
                return;
            }
        }
    }

    private static void build_max_heap(int[] A) {
        int len = A.length;
        for (int i = len / 2 - 1; i >= 0; i--) {
//            max_heapify(A, i);
            iterative_max_heapify(A,i);
        }
    }

    public static void main(String[] args) throws IOException {
        int[] A = {5, 3, 17, 10, 84, 19, 6, 22, 9};
//        max_heapify(A, 1);
//        iterative_max_heapify(A,2);
        build_max_heap(A);
        for (int a : A) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
