import java.util.Stack;

public class simple1047 {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == s.charAt(i)){
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (!stack.isEmpty()){
            stringBuffer.append(stack.peek());
            stack.pop();
        }

        return stringBuffer.reverse().toString();
    }
}
