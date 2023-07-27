import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class middle429 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int len = queue.size();
            while (len > 0){
                Node tmp = queue.poll();
                list.add(tmp.val);
                if (tmp.children.size() != 0){
                    for (int i = 0; i < tmp.children.size(); i++) {
                        if (tmp.children.get(i) != null) queue.offer(tmp.children.get(i));
                    }
                }
                len--;
            }
            res.add(list);
        }
        return res;
    }
}
