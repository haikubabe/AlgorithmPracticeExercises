import java.util.Scanner;

public class UVa739 {
    private static void printOutput(String str) {
        for (int i = str.length() + 10; i < 35; i++) {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("         " + "NAME");
        printOutput("NAME");
        System.out.println("SOUNDEX CODE");
        int soundexCodeArr[] = {0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2};

        while (scanner.hasNext()) {
            String str = scanner.next();
            StringBuilder soundexString = new StringBuilder();
            for (int i = 0; i < str.length() && soundexString.length() < 4; i++) {
                char ch = str.charAt(i);
                if (i == 0)
                    soundexString.append(ch);
                else if (soundexCodeArr[ch - 'A'] != soundexCodeArr[str.charAt(i - 1) - 'A'] && soundexCodeArr[ch - 'A'] != 0)
                    soundexString.append(soundexCodeArr[ch - 'A']);
            }
            if (soundexString.length() < 4) {
                int noZeros = 4 - soundexString.length();
                int count = 0;
                while (count < noZeros) {
                    soundexString.append('0');
                    count++;
                }
            }
            System.out.print("         " + str);
            printOutput(str);
            System.out.println(soundexString);
        }
        System.out.println("                   " + "END OF OUTPUT");
    }
}
