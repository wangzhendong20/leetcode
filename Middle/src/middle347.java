import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class middle347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
//        PriorityQueue<int[]> queue = new PriorityQueue<>((pair1,pair2)->pair1[1]-pair2[1]);
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            if (queue.size() < k){
                queue.add(new int[]{entry.getKey(),entry.getValue()});
            }else {
                if (entry.getValue() > queue.peek()[1]){
                    queue.poll();
                    queue.add(new int[]{entry.getKey(),entry.getValue()});
                }
            }
        }
        int[] res = new int[k];
        for (int i = k-1; i >= 0 ; i--) {
            res[i] = queue.poll()[0];
        }
        return res;
    }
}
