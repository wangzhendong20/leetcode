import java.util.Stack;

public class simple232 {
    class MyQueue{
        Stack<Integer> stackIn;
        Stack<Integer> stackOut;
        public MyQueue() {
            stackIn = new Stack<>();
            stackOut = new Stack<>();
        }

        public void push(int x) {
            stackIn.push(x);
        }

        public int pop() {
            change(stackIn,stackOut);
            int res = stackOut.pop();
            return res;
        }

        public int peek() {
            change(stackIn,stackOut);
            int res = stackOut.peek();
            return res;
        }

        public boolean empty() {
            if (stackIn.isEmpty() && stackOut.isEmpty()){
                return true;
            }
            return false;
        }

        public void change(Stack<Integer> stackIn,Stack<Integer> stackOut){
            if (stackOut.isEmpty()){
                while (!stackIn.isEmpty()){
                    int tmp = stackIn.pop();
                    stackOut.push(tmp);
                }
            }
        }
    }
}
