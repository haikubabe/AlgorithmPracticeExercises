import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 23;
        Stack<Integer> stack = new Stack<Integer>();
        while (num > 0) {
            int rem = num % 2;
            stack.push(rem);
            num = num / 2;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
