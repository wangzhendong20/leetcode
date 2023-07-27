import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class middle56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> res = new LinkedList<>();

        int left = intervals[0][0];
        int right = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] > right){
                res.add(new int[]{left,right});
                left = intervals[i][0];
                right = intervals[i][1];
            }else {
                right = Math.max(right,intervals[i][1]);
            }
        }
        res.add(new int[]{left,right});
        return res.toArray(new int[res.size()][]);

    }
}
