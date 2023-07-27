import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class simple2032 {
    public static void main(String[] args) {
        int[] nums1 = {1,1,3,2};
        int[] nums2 = {2,3};
        int[] nums3 = {3};
        List<Integer> arrayList = twoOutOfThree(nums1, nums2, nums3);
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }

    }
    public static List<Integer> twoOutOfThree(int[] nums1,int[] nums2,int[] nums3){
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        for (Integer i:nums1
             ) {
            set1.add(i);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for (Integer i:nums2
        ) {
            set2.add(i);
        }
        HashSet<Integer> set3 = new HashSet<>();
        for (Integer i:nums3
        ) {
            set3.add(i);
        }


        Iterator<Integer> it = set1.iterator();
        while (it.hasNext()){
            int ele = it.next();
            if (set2.contains(ele) || set3.contains(ele)){
                list.add(ele);
                it.remove();
            }
        }
        Iterator<Integer> it2 = set2.iterator();
        while (it2.hasNext()){
            int ele = it2.next();
            if (set3.contains(ele) && !list.contains(ele)){
                list.add(ele);
                it2.remove();
            }
        }

        return list;
    }
}
