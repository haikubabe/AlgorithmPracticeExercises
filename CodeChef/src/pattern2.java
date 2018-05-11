public class pattern2 {
    public static void main (String[] args) {
        for (int i=0;i<5;i++) {
            int j=0;
            for (j=0;j<5-i-1;j++) {
                System.out.print(" ");
            }
            char ch='A';
            int count=0;
            while (j<5) {
                System.out.print((char)(ch+count));
                count++;
                j++;
            }
            System.out.println();
        }
    }
}
