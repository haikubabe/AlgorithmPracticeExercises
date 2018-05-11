public class pattern5 {
    public static void main (String[] args) {
        int count=0,n=1;
        for (int i=0;i<5;i++) {
            int j;
            for (j=0;j<5-i-1;j++) {
                System.out.print(" ");
            }
            char ch='A';
            j=0;
            ch = (char)(ch+count);
            while (j<2*n-1) {
                System.out.print(ch);
                ch--;
                j++;
            }
            n++;
            count = count+2;
            System.out.println();
        }
    }
}
