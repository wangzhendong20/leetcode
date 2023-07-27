import java.util.HashMap;
import java.util.Map;

public class thirteen {
    public static void main(String[] args) {
        System.out.println(solution.romanToInt("LVIII"));
    }
}

/**
 * ��������
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
     ͨ������£�����������С�������ڴ�����ֵ��ұߡ�
     ��������ַ���������������ô���Խ�ÿ���ַ�����һ��������ֵ���ۼ�ÿ���ַ���Ӧ����ֵ���ɡ�

     ������С�������ڴ�����ֵ���ߵ���������ݹ�����Ҫ��ȥС�����֡�
     �����������������Ҳ���Խ�ÿ���ַ�����һ��������ֵ����һ�������Ҳ�����ֱ������򽫸����ֵķ���ȡ����


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
