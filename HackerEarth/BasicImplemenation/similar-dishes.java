import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            String[] firstDish = new String[4];
            String[] secondDish = new String[4];
            for (int p=0;p<4;p++) {
                firstDish[p] = in.next();
            }
            for (int q=0;q<4;q++) {
                secondDish[q] = in.next();
            }
            int count=0;
            for (int j=0;j<4;j++) {
                for (int k=0;k<4;k++) {
                    if (firstDish[j].equals(secondDish[k])) {
                        count++;
                        break;
                    }
                }
            }
            if (count>=2) {
                System.out.println("similar");
            } else {
                System.out.println("dissimilar");
            }
        }
    }
}