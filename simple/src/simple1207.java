import java.util.*;

public class simple1207 {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }

        long count = map.values().stream().count();

        Set<Integer> set = new HashSet<>();
        map.values().stream().forEach((Integer nums) -> {
            set.add(nums);
        });

        long count1 = set.stream().count();
        if (count1 == count) return true;
        return false;


    }
}
