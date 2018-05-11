import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UVa394 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int R = scanner.nextInt();
        Map<String, MyArray> myArrayMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String arrName = scanner.next();
            int baseAddress = scanner.nextInt();
            int size = scanner.nextInt();
            int dimension = scanner.nextInt();
            int[] bounds = new int[2 * dimension];
            for (int j = 0; j < 2 * dimension; j++) {
                bounds[j] = scanner.nextInt();
            }
            MyArray myArray = new MyArray(baseAddress, size, dimension, bounds);
            myArrayMap.put(arrName, myArray);
        }
        for (int i = 0; i < R; i++) {
            String name = scanner.next();
            System.out.print(name + "[");
            int result = 0;
            if (myArrayMap.containsKey(name)) {
                MyArray myArray = myArrayMap.get(name);
                int dimension = myArray.dimension;
                int size = myArray.size;
                int[] bounds = myArray.bounds;
                int base = myArray.baseAddress;
                int[] reference = new int[dimension];
                int[] C = new int[dimension + 1];
                for (int j = 0; j < dimension; j++) {
                    int val = scanner.nextInt();
                    System.out.print(val);
                    reference[j] = val;
                    if (j != dimension - 1)
                        System.out.print(", ");
                }
                System.out.print("] = ");
                //find the physical address
                for (int j = dimension; j >= 0; j--) {
                    if (j == dimension) {
                        C[j] = size;
                        result += C[j] * reference[j - 1];
                    } else if (j != 0 && j < dimension) {
                        C[j] = C[j + 1] * (bounds[2 * (j + 1) - 1] - bounds[2 * (j + 1) - 2] + 1);
                        result += C[j] * reference[j - 1];
                    } else if (j == 0) {
                        int zeroVal = base;
                        int m = j;
                        for (int k = j + 1; k <= dimension; k++) {
                            zeroVal -= (C[k] * bounds[m]);
                            m += 2;
                        }
                        C[j] = zeroVal;
                        result += C[j];
                    }
                }
                System.out.println(result);
            }   //if the array name is in the array map
        }
    }

    static class MyArray {
        int baseAddress;
        int size;
        int dimension;
        int[] bounds;

        MyArray(int baseAddress, int size, int dimension, int[] bounds) {
            this.baseAddress = baseAddress;
            this.size = size;
            this.dimension = dimension;
            this.bounds = bounds;
        }
    }
}
