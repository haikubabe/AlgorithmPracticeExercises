import java.util.Scanner;

class TestClass {
    static boolean isVowel(char c) {
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')?true:false;
    }

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int max=0,count=0;
        for (int i=0;i<str.length();i++) {
            if (isVowel(str.charAt(i))) {
                count++;
            } else {
                count = 0;
            }
            if (count>max) {
                max=count;
            }
        }
        System.out.println(max);
    }
}