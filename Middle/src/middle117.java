import java.util.LinkedList;
import java.util.Queue;

public class middle117 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if (root != null) queue.offer(root);
        while (!queue.isEmpty()){
            int len = queue.size();
            Node cur = queue.poll();
            if (cur.left != null) queue.offer(cur.left);
            if (cur.right != null) queue.offer(cur.right);
            for (int i = 1; i < len; i++) {
                Node next = queue.poll();
                if (next.left != null) queue.offer(next.left);
                if (next.right != null) queue.offer(next.right);
                cur.next = next;
                cur = next;
            }
        }
        return root;
    }
}
