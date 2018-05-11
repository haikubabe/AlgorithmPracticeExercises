import java.util.Scanner;
import java.lang.StringBuilder;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.next();
        StringBuilder ans=new StringBuilder();
        int K=in.nextInt();
        for (int i=0;i<str.length();i++) {
            if (str.charAt(i)!='9' && K>0) {
                ans.append("9");
                K--;
            }else{
                ans.append(str.charAt(i));
            }
        }
        System.out.println(ans);
    }
}