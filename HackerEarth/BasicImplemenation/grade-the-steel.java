import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int TE = in.nextInt();
        for (int i=0;i<TE;i++) {
            int H=in.nextInt();
            double C=in.nextDouble();
            int T = in.nextInt();
            int grade=0;
            if (H>50&&C<0.7&&T>5600) {
                grade=10;
            } else if(H>50&&C<0.7) {
                grade=9;
            } else if(C<0.7&&T>5600) {
                grade=8;
            } else if(H>50&&T>5600) {
                grade=7;
            } else if(H>50||C<0.7||T>5600) {
                grade=6;
            } else {
                grade=5;
            }
            System.out.println(grade);
        }
    }
}