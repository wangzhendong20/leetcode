import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class simple2287 {
    public static void main(String[] args) {

    }

    public static int rearrangeCharacters(String s, String target) {
        Map<Character,Integer> target_map = new HashMap<>();
        for (int i = 0; i < target.length(); i++) {
            if (target_map.containsKey(target.charAt(i))){
                target_map.put(target.charAt(i),target_map.get(target.charAt(i))+1);
            }else {
                target_map.put(target.charAt(i),1);
            }
        }
        Set<Character> target_set = target_map.keySet();
        Map<Character,Integer> s_map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (target_set.contains(s.charAt(i))){
                if (s_map.containsKey(s.charAt(i))){
                    s_map.put(s.charAt(i),s_map.get(s.charAt(i))+1);
                }else {
                    s_map.put(s.charAt(i),1);
                }
            }
        }
        int res = 999999999;
        if (target_map.size() == s_map.size()){
            for (Character c:s_map.keySet()
                 ) {
                int num = s_map.get(c) / target_map.get(c);
                if (num < res){
                    res = num;
                }
            }
            return res;
        }

        return 0;
    }
}
