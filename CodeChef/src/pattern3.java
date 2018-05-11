public class pattern3 {
    public static void main (String[] args) {
        for (int i=0;i<5;i++) {
            int count=0,j=0;
            while (j<i) {
                System.out.print(" ");
                j++;
            }
            for (j=i;j<5;j++) {
                count++;
                System.out.print(count);
            }
            System.out.println();
        }
    }
}
