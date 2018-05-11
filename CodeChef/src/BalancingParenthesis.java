class Stack {
    private char stack[];
    private int top;

    Stack() {
        stack = new char[100];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public void push(char data) {
        if (isFull())
            System.out.println("Stack Overflow");
        else {
            stack[++top] = data;
        }
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return '\0';
        } else
            return stack[top--];
    }
}

public class BalancingParenthesis {
    private static boolean isMatchingPair(char ch1, char ch2) {
        if (ch1 == '(' && ch2 == ')')
            return true;
        else if (ch1 == '{' && ch2 == '}')
            return true;
        else if (ch1 == '[' && ch2 == ']')
            return true;
        else
            return false;
    }

    private static boolean areParenthesisBalanced(String str) {
        Stack stack = new Stack();
        char ch[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (ch[i] == '(' || ch[i] == '{' || ch[i] == '[')
                stack.push(ch[i]);
            if (ch[i] == ')' || ch[i] == '}' || ch[i] == ']') {
                if (stack.isEmpty())
                    return false;
                else if (!isMatchingPair(stack.pop(), ch[i]))
                    return false;
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String str = "({)}";
        if (areParenthesisBalanced(str))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}