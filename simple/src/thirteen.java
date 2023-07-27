import java.util.HashMap;
import java.util.Map;

public class thirteen {
    public static void main(String[] args) {
        System.out.println(solution.romanToInt("LVIII"));
    }
}

/**
 * 罗马数字
 */
class solution{
    private static Map<Character, Integer> symbolValues = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    /**
     通常情况下，罗马数字中小的数字在大的数字的右边。
     若输入的字符串满足该情况，那么可以将每个字符视作一个单独的值，累加每个字符对应的数值即可。

     若存在小的数字在大的数字的左边的情况，根据规则需要减去小的数字。
     对于这种情况，我们也可以将每个字符视作一个单独的值，若一个数字右侧的数字比它大，则将该数字的符号取反。


     */
    public static int romanToInt(String s){
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int value = symbolValues.get(s.charAt(i));
            if (i < n-1 && value < symbolValues.get(s.charAt(i+1))){
                ans -= value;
            }else {
                ans += value;
            }
        }
        return ans;
    }

}
