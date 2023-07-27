public class middle738 {
    public static int monotoneIncreasingDigits(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        int flag = chars.length;
        for (int i = chars.length-1; i > 0; i--) {
            if (Integer.valueOf(chars[i-1]) > Integer.valueOf(chars[i])){
                chars[i-1]--;
                flag = i;
            }
        }
        for (int i = chars.length-1; i >= flag; i--) {
            chars[i] = '9';
        }
        return Integer.valueOf(String.valueOf(chars));
    }

    public static void main(String[] args) {
        int res = monotoneIncreasingDigits(10);
        System.out.println(res);
    }
}
