import java.util.Stack;

public class middle150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+")){
                stack.push(stack.pop() + stack.pop());
            } else if (token.equals("-")) {
                stack.push(-stack.pop() + stack.pop());
            } else if (token.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (token.equals("/")) {
                int tmp1 = stack.pop();
                int tmp2 = stack.pop();
                stack.push(tmp2/tmp1);
            }else {
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.peek();
    }
}
