public class pattern4 {
    public static void main (String[] args) {
        int n=5;
        for (int i=0;i<5;i++) {
            int j=0;
            while (j<i) {
                System.out.print(" ");
                j++;
            }
            j=0;
            while (j< (2*n-1)) {
                System.out.print(n);
                j++;
            }
            n--;
            System.out.println();
        }
    }
}
