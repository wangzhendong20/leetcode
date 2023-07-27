import java.util.LinkedList;
import java.util.Queue;

public class simple225 {
    class MyStack {
        Queue<Integer> queue;
        Queue<Integer> queuetmp;
        public MyStack() {
            queue = new LinkedList<>();
            queuetmp = new LinkedList<>();
        }

        public void push(int x) {
            queuetmp.offer(x);
            while (!queue.isEmpty()){
                queuetmp.offer(queue.poll());
            }
            Queue<Integer> tmp;
            tmp = queuetmp;
            queuetmp = queue;
            queue = tmp;
        }

        public int pop() {
            return queue.poll();
        }

        public int top() {
            return queue.peek();
        }

        public boolean empty() {
            return queue.isEmpty();
        }

    }
}
