import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            char c = in.next().charAt(0);
            if (c == 'B'|| c == 'b') System.out.println("BattleShip");
            else if (c == 'C' || c == 'c') System.out.println("Cruiser");
            else if (c == 'D' || c == 'd') System.out.println("Destroyer");
            else if (c == 'F' || c == 'f') System.out.println("Frigate");
        }
    }
}