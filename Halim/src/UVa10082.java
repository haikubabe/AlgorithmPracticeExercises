import java.util.Scanner;

public class UVa10082 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] characterArr = {'A', 'V', 'X', 'S', 'W', 'D', 'F', 'G', 'U', 'H', 'J', 'K', 'N', 'B', 'I', 'O', 'Q', 'E', 'A', 'R', 'Y', 'C', 'Q', 'Z', 'T', 'Z'};
        char[] digitsArr = {'9', '`', '1', '2', '3', '4', '5', '6', '7', '8'};
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if(str.charAt(i)==' ')
                    System.out.print(' ');
                else if (Character.isDigit(ch))
                    System.out.print(digitsArr[ch-'0']);
                else if (ch == '-')
                    System.out.print('0');
                else if (ch == '=')
                    System.out.print('-');
                else if (ch == '[')
                    System.out.print('P');
                else if (ch == ']')
                    System.out.print('[');
                else if (ch == '\\')
                    System.out.print(']');
                else if (ch == ';')
                    System.out.print('L');
                else if (ch == '\'')
                    System.out.print(';');
                else if (ch == ',')
                    System.out.print('M');
                else if (ch == '.')
                    System.out.print(',');
                else if (ch == '/')
                    System.out.print('.');
                else if (Character.isLetter(ch))
                    System.out.print(characterArr[ch - 'A']);
            }
            System.out.print("\n");
        }
    }
}
