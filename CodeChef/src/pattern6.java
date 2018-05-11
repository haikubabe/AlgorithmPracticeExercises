public class pattern6 {
    static void printString(int char_start) {
        for (int i=char_start;i>=0;i--) {
            System.out.print((char)('A'+i));
        }
        for (int i=1;i<=char_start;i++) {
            System.out.print((char)('A'+i));
        }
    }
    public static void main(String[] args) {
        int char_start=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            printString(char_start);
            char_start++;
            System.out.println();
        }
    }
}
