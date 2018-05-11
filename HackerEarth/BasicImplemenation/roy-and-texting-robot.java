import java.util.Scanner;
import java.util.HashMap;

class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        HashMap<Character, Integer> pos = new HashMap<Character, Integer>();
        HashMap<Character, Integer> val = new HashMap<Character, Integer>();

        pos.put('.', 1);
        pos.put(',', 1);
        pos.put('?', 1);
        pos.put('!', 1);
        pos.put('a', 2);
        pos.put('b', 2);
        pos.put('c', 2);
        pos.put('d', 3);
        pos.put('e', 3);
        pos.put('f', 3);
        pos.put('g', 4);
        pos.put('h', 4);
        pos.put('i', 4);
        pos.put('j', 5);
        pos.put('k', 5);
        pos.put('l', 5);
        pos.put('m', 6);
        pos.put('n', 6);
        pos.put('o', 6);
        pos.put('p', 7);
        pos.put('q', 7);
        pos.put('r', 7);
        pos.put('s', 7);
        pos.put('t', 8);
        pos.put('u', 8);
        pos.put('v', 8);
        pos.put('w', 9);
        pos.put('x', 9);
        pos.put('y', 9);
        pos.put('z', 9);
        pos.put('_', 0);

        pos.put('0',0);
        pos.put('1',1);
        pos.put('2',2);
        pos.put('3',3);
        pos.put('4',4);
        pos.put('5',5);
        pos.put('6',6);
        pos.put('7',7);
        pos.put('8',8);
        pos.put('9',9);

        val.put('.', 1);
        val.put(',', 2);
        val.put('?', 3);
        val.put('!', 4);
        val.put('1', 5);
        val.put('a', 1);
        val.put('b', 2);
        val.put('c', 3);
        val.put('2', 4);
        val.put('d', 1);
        val.put('e', 2);
        val.put('f', 3);
        val.put('3', 4);
        val.put('g', 1);
        val.put('h', 2);
        val.put('i', 3);
        val.put('4', 4);
        val.put('j', 1);
        val.put('k', 2);
        val.put('l', 3);
        val.put('5', 4);
        val.put('m', 1);
        val.put('n', 2);
        val.put('o', 3);
        val.put('6', 4);
        val.put('p', 1);
        val.put('q', 2);
        val.put('r', 3);
        val.put('s', 4);
        val.put('7', 5);
        val.put('t', 1);
        val.put('u', 2);
        val.put('v', 3);
        val.put('8', 4);
        val.put('w', 1);
        val.put('x', 2);
        val.put('y', 3);
        val.put('z', 4);
        val.put('9', 5);
        val.put('_', 1);
        val.put('0', 2);

        while (T-- > 0) {
            String str = in.next();
            int ans=0,position=1;
            for (int i=0;i<str.length();i++) {
                int p=pos.get(str.charAt(i));
                if (position!=p) {
                    ans++;
                    position=p;
                }
                ans+=val.get(str.charAt(i));
            }
            System.out.println(ans);
        }
    }
}