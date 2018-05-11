import java.io.PrintWriter;
import java.util.*;

class TestClass {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        Stack<Integer> stack = new Stack<Integer>();
        int Q=in.nextInt();
        for (int k=0;k<Q;k++) {
            int type=in.nextInt();
            if (type == 1) {
                if (stack.empty())
                    out.println("No Food");
                else {
                    Integer price = stack.pop();
                    out.println(price);
                }
            } else {
                int C = in.nextInt();
                stack.push(C);
            }
        }
    }
}