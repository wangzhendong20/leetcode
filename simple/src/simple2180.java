public class simple2180 {
    public static void main(String[] args) {
        int num = 1000;
        System.out.println(countEven(num));
    }

    public static int countEven(int num) {
        int res = 0;
        for (int i = num; i > 0; i--) {
            int x = i, sum = 0;
            while (x != 0){
                sum += x % 10;
                x /= 10;
            }
            if (sum % 2 == 0){
                res++;
            }
        }
        return res;
    }
}
