import java.util.*;

public class middle1801 {
    public static void main(String[] args) {
        int[][] orders = {{30,27,1},{18,9,1},{11,4,0},{21,11,0},{1,1,1},{24,20,1},{15,13,1},{13,3,0},{30,11,1}};
        System.out.println(getNumberOfBacklogOrders(orders));
    }


    public static int getNumberOfBacklogOrders(int[][] orders) {
        PriorityQueue<Integer> buyQue = new PriorityQueue<>((i1, i2)->orders[i2][0] - orders[i1][0]);
        PriorityQueue<Integer> sellQue = new PriorityQueue<>((i1, i2)->orders[i1][0] - orders[i2][0]);
        for(int i = 0; i < orders.length; i++){
            int[] o = orders[i];
            int type = o[2], price = o[0];
            if(type == 0){ // o是采购订单buy
                while(!sellQue.isEmpty() && o[1] > 0){
                    int[] q = orders[sellQue.peek()];
                    if(q[0] > price)break;
                    int min = Math.min(o[1], q[1]);
                    o[1] -= min;
                    q[1] -= min;
                    if(q[1] == 0)sellQue.poll();
                }
                if(o[1] > 0)buyQue.offer(i);
            }else{ // o是销售订单 sell
                while(!buyQue.isEmpty() && o[1] > 0){
                    int[] q = orders[buyQue.peek()];
                    if(q[0] < price)break;
                    int min = Math.min(o[1], q[1]);
                    o[1] -= min;
                    q[1] -= min;
                    if(q[1] == 0) buyQue.poll();;
                }
                if(o[1] > 0)sellQue.offer(i);
            }
        }

        int ret = 0;
        for(int[] o: orders)ret = (ret + o[1]) % (1000000007);
        return ret;
    }


    // 超时
//    public static int getNumberOfBacklogOrders(int[][] orders){
//        Map<Integer,Integer> buy = new TreeMap<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
//        Map<Integer,Integer> sell = new TreeMap<>();
//        for (int i = 0; i < orders.length; i++) {
//            int weight = orders[i][0];
//            int num = orders[i][1];
//            if (orders[i][2] == 0){
//                if (!sell.isEmpty()){
//                    List<Integer> lists = new ArrayList<>();
//                    Iterator<Integer> it = sell.keySet().iterator();
//                    while (it.hasNext()) {
//                        int key = it.next();
//                        lists.add(key);
//                    }
//                    int k = 0;
//                    for (Integer j:lists
//                         ) {
//                        if (weight >= j){
//                            if (sell.get(j) > num){
//                                sell.put(j, sell.get(j)-num);
//                                break;
//                            }else {
//                                if (sell.get(j) == num){
//                                    sell.remove(j);
//                                    break;
//                                }else {
//                                    num -= sell.get(j);
//                                    sell.remove(j);
//                                    k++;
//                                }
//                            }
//                        }else {
//                            k++;
//                        }
//                    }
//                    if (k==lists.size()){
//                        if (buy.containsKey(weight)){
//                            buy.put(weight,buy.get(weight)+num);
//                        }else {
//                            buy.put(weight,num);
//                        }
//                    }
//                }else {
//                    if (buy.containsKey(weight)){
//                        buy.put(weight,buy.get(weight)+num);
//                    }else {
//                        buy.put(weight,num);
//                    }
//                }
//            }else {
//                if (!buy.isEmpty()){
//                    List<Integer> lists = new ArrayList<>();
//                    Iterator<Integer> it = buy.keySet().iterator();
//                    while (it.hasNext()) {
//                        int key = it.next();
//                        lists.add(key);
//                    }
//                    int k = 0;
//                    for (Integer j:lists
//                    ) {
//                        if (weight <= j){
//                            if (buy.get(j) > num){
//                                buy.put(j, buy.get(j)-num);
//                                break;
//                            }else {
//                                if (buy.get(j) == num){
//                                    buy.remove(j);
//                                    break;
//                                }else {
//                                    num -= buy.get(j);
//                                    buy.remove(j);
//                                    k++;
//                                }
//                            }
//                        }else {
//                            k++;
//                        }
//                    }
//                    if (k==lists.size()){
//                        if (sell.containsKey(weight)){
//                            sell.put(weight,sell.get(weight)+num);
//                        }else {
//                            sell.put(weight,num);
//                        }
//                    }
//                }else {
//                    if (sell.containsKey(weight)){
//                        sell.put(weight,sell.get(weight)+num);
//                    }else {
//                        sell.put(weight,num);
//                    }
//                }
//            }
//        }
//        long ans = 0;
//        for (Integer buyvalues: buy.values()
//             ) {
//            ans += buyvalues;
//        }
//        for (Integer sellvalues: sell.values()
//        ) {
//            ans += sellvalues;
//        }
//        return (int) (ans % (1e9 + 7));
//    }



}
