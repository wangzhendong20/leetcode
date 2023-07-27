import java.util.Arrays;

public class middle1806 {
    public static void main(String[] args) {

    }

//    public int reinitializePermutation(int n) {
//        int[] perm = new int[n];
//        int[] target = new int[n];
//        for (int i = 0; i < n; i++) {
//            perm[i] = i;
//            target[i] = i;
//        }
//        int step = 0;
//        while (true){
//            int[] arr = new int[n];
//            for (int i = 0; i < n; i++) {
//                if ((i%2) != 0 ){
//                    arr[i] = perm[n/2+(i-1)/2];
//                }else {
//                    arr[i] = perm[i/2];
//                }
//            }
//            perm = arr;
//            step++;
//            if (Arrays.equals(perm,target)){
//                break;
//            }
//        }
//        return step;
//    }

    public int reinitializePermutation(int n) {
        int i = 1, step = 1;
        while (true) {
            i = i % 2 == 0 ? i / 2 : (n - 1 + i) / 2;
            if (i == 1) return step;
            step++;
        }
    }
}
