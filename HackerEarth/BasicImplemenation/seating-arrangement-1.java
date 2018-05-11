import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            int seatNum = in.nextInt();
            int rem = seatNum % 12;
            int seatFacing;
            String seatType = "";
            int min;

            if (rem == 0) {
                seatFacing = seatNum - 11;
            } else {
                seatFacing =  ((13 - rem) - rem) + seatNum;
            }


            min = (13-rem > rem)? rem : 13-rem;
            switch(min) {
                case 0:
                case 1:
                case 6:
                    seatType = "WS";
                    break;
                case 2:
                case 5:
                    seatType = "MS";
                    break;
                case 3:
                case 4:
                    seatType = "AS";
                    break;
            }

            System.out.println(seatFacing + " " + seatType);
        }
    }
}
