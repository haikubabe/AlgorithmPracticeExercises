import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            char[] aarray = br.readLine().toCharArray();
            char[] barray = br.readLine().toCharArray();
            int[] alice = new int[26];
            int[] bob = new int[26];
            boolean flagA = false, flagB = false;
            for (char a : aarray) {
                if (a != ' ') {
                    alice[a - 'a']++;
                }
            }
            for (char b : barray) {
                if (b != ' ') {
                    bob[b - 'a']++;
                }
            }
            for (int i = 0; i < 26; i++) {
                if (alice[i] < bob[i]) {
                    flagB = true;
                } else if (bob[i] < alice[i]) {
                    flagA = true;
                }
                if (flagA && flagB) break;
            }
            if (flagA && flagB) System.out.println("You draw some.");
            else if (flagA) System.out.println("You win some.");
            else System.out.println("You lose some.");
        }
    }
}