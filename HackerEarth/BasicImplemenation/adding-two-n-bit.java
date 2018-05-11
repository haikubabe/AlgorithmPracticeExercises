import java.util.Scanner;

class TestClass {
    static String addingTwoNBit(char[] A, char[] B) {
        int n = A.length;
        int carry = 0;
        String res = "";
        for (int i = n - 1; i >= 0; i--) {
            int firstBit = A[i] - '0';
            int secondBit = B[i] - '0';
            int sum = firstBit + secondBit + carry;
            res = (sum % 2) + res;
            carry = sum / 2;
        }
        if (carry==1) res = carry + res;
        return res;
    }

    public static void main(String[] args) {
        char[] A = {'1', '1', '1', '0', '0', '1', '0', '1', '0', '1'};
        char[] B = {'1', '1', '0', '0', '0', '1', '1', '1', '1', '0'};
        int n = A.length;
        String binarySum = addingTwoNBit(A, B);
        char[] C = new char[n + 1];
        for (int i = 0; i < C.length; i++) {
            C[i] = binarySum.charAt(i);
            System.out.print(C[i]);
        }
    }
}