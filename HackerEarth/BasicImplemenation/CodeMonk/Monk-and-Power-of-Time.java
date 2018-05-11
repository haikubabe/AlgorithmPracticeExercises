import java.io.PrintWriter;
import java.util.*;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);

        int N = in.nextInt();
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < N; i++) {
            queue.add(in.nextInt());
        }
        int res = 0;
        for (int i = 0; i < N; i++) {
            int num = in.nextInt();
            if (queue.peek() == num) {
                queue.remove();
                res++;
            } else {
                while (queue.peek() != num) {
                    Integer val = queue.remove();
                    queue.add(val);
                    res++;
                }
                queue.remove();
                res++;
            }
        }
        out.println(res);
    }
}