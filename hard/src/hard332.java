import java.util.*;

public class hard332 {
    Deque<String> res = new LinkedList<>();
    Map<String,Map<String,Integer>> map = new HashMap<>();
    public List<String> findItinerary(List<List<String>> tickets) {
        for (List<String> t: tickets
             ) {
            Map<String,Integer> temp;
            if (map.containsKey(t.get(0))){
                temp = map.get(t.get(0));
                temp.put(t.get(1),temp.getOrDefault(t.get(1),0)+1);
            }else {
                temp = new TreeMap<>();
                temp.put(t.get(1),1);
            }
            map.put(t.get(0),temp);
        }
        res.add("JFK");
        backtracking(tickets);
        return new ArrayList<>(res);
    }

    private boolean backtracking(List<List<String>> tickets){
        if (res.size() == tickets.size() + 1){
            return true;
        }

        String last = res.getLast();
        if (map.containsKey(last)){
            for (Map.Entry<String,Integer> target : map.get(last).entrySet()){
                int count = target.getValue();
                if (count > 0){
                    res.add(target.getKey());
                    target.setValue(count-1);
                    if (backtracking(tickets)) return true;
                    res.removeLast();
                    target.setValue(count);
                }
            }
        }
        return false;
    }
}
