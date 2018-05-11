import java.io.PrintWriter;
import java.util.*;

class TestClass {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        Stack<Integer> stack = new Stack<Integer>();
        int N=in.nextInt();
        for (int k=0;k<N;k++) {
            int val=in.nextInt();
            if (val != 0)
                stack.push(val);
            else {
                if (!stack.empty())
                    stack.pop();
            }
        }
        int sum=0;
        while (!stack.empty()) {
            sum+=stack.pop();
        }
        out.println(sum);
    }
}