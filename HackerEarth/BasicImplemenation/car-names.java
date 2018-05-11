import java.util.Scanner;

class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        while (N-->0) {
            String str=in.next();
            int len=str.length();
            int[] countArr=new int[26];
            int count=0;
            for (int i=0;i<len;i++) {
                countArr[str.charAt(i)-97]++;
            }
            for (int i=0;i<len-1;i++) {
                if (str.charAt(i)!=str.charAt(i+1)) {
                    count++;
                }
            }
            int freq=0;
            for (int i=0;i<26;i++) {
                if (countArr[i]!=0) {
                    freq++;
                }
            }
            if (count==2&&freq==3) System.out.println("OK");
            else System.out.println("Not OK");
        }
    }
}