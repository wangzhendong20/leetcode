import java.util.*;

public class simple501 {
//    //±©Á¦·¨
//    public int[] findMode(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        traversal(root,list);
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < list.size(); i++) {
//            if (!map.containsKey(list.get(i))){
//                map.put(list.get(i), 1);
//            }else {
//                map.put(list.get(i),map.get(list.get(i))+1);
//            }
//        }
//        List<Integer> reslist = new ArrayList<>();
//        int max = Collections.max(map.values());
//        for (Map.Entry<Integer,Integer> entry: map.entrySet()
//             ) {
//            if (entry.getValue() == max){
//                reslist.add(entry.getKey());
//            }
//        }
//        int[] res = new int[reslist.size()];
//        for (int i = 0; i < reslist.size(); i++) {
//            res[i] = reslist.get(i);
//        }
//
//        return res;
//    }
//
//    private void traversal(TreeNode cur, List<Integer> list){
//        if (cur == null) return;
//        traversal(cur.left,list);
//        list.add(cur.val);
//        traversal(cur.right,list);
//    }

    List<Integer> resList = new ArrayList<>();
    int maxCount = 0;
    int count = 0;
    TreeNode pre = null;

    public int[] findMode(TreeNode root) {
        traversal(root);
        int[] res = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }
        return res;
    }
    private void traversal(TreeNode cur){
        if (cur == null) return;
        traversal(cur.left);
        if (pre == null || cur.val != pre.val){
            count = 1;
        }else {
            count++;
        }
        if (count > maxCount){
            resList.clear();
            resList.add(cur.val);
            maxCount = count;
        }else if (count == maxCount){
            resList.add(cur.val);
        }
        pre = cur;
        traversal(cur.right);
    }
}
