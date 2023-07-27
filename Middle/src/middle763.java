import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class middle763 {
    public static List<Integer> partitionLabels(String s) {
        List<Integer> list = new LinkedList<>();
        int[] edge = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            edge[chars[i] - 'a'] = i;
        }
        int end = 0;
        int begin = -1;
        for (int i = 0; i < chars.length; i++) {
            end = Math.max(end, edge[chars[i] - 'a']);
            if (i == end){
                list.add(end - begin);
                begin = i;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        List<Integer> list = partitionLabels(s);
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
