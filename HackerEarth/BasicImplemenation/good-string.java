import java.util.Scanner;

class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String str=in.next();
        int[] count=new int[26];
        for (int i=0;i<str.length();i++) {
            count[str.charAt(i)-97]++;
        }
        int ans=0;
        for (int i=0;i<26;i++) {
            if (count[i]>1) {
                ans+=count[i]-1;
            }
        }
        System.out.println(ans);
    }
}