import java.util.Scanner;

class TestClass {
    static String addTwoBit(String A, String B) {
        int len1 = A.length();
        int len2 = B.length();
        String str1 = A, str2 = B;
        if (len1<len2) {
            for (int i=0;i<len2-len1;i++) {
                str1="0"+str1;
            }
        } else if (len2<len1) {
            for (int i=0;i<len1-len2;i++) {
                str2="0"+str2;
            }
        }
        int n = str1.length();
        int carry = 0;
        String res = "";
        for (int i = n - 1; i >= 0; i--) {
            int firstBit = str1.charAt(i) - '0';
            int secondBit = str2.charAt(i) - '0';
            int sum = firstBit ^ secondBit ^ carry;
            res = sum + res;
            carry = (firstBit & secondBit) | (firstBit & carry) | (secondBit & carry);
        }
        if (carry == 1) res = carry + res;
        return res;
    }

    public static void main(String[] args) {
        String A = "110011";
        String B = "10";
        String binarySum = addTwoBit(A, B);
        System.out.println(binarySum);
    }
}