/**
 * �жϻ�����
 */
public class nine {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));

    }

//    public static boolean isPalindrome(int x){
//
//
//        StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer.append(x);
//        for (int i = 0; i < stringBuffer.length(); i++) {
//            if (stringBuffer.charAt(i) != stringBuffer.charAt(stringBuffer.length()-1-i)){
//                return false;
//            }
//        }
//        return true;
//    }

    // ���
    /**
     �����ַ�ת
     ����1221, ȡ����λ1221%10 = 1����ȡ�����ڶ�λ 122/10 = 2����ǰһλ����10��1*10+2 = 12
     ��ԭʼ����С�ڻ���ڷ�ת�������ʱ�����Ѿ�������һ��λ��������
     */
    public static boolean isPalindrome(int x){
        // ���������
        // ������������ x < 0 ʱ��x ���ǻ�������
        // ͬ���أ�������ֵ����һλ�� 0��Ϊ��ʹ������Ϊ���ģ�
        // �����һλ����ҲӦ���� 0
        // ֻ�� 0 ������һ����
        if (x < 0 || (x%10 == 0 && x!= 0)){
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber){
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // �����ֳ���Ϊ����ʱ�����ǿ���ͨ�� revertedNumber/10 ȥ��������λ�����֡�
        // ���磬������Ϊ 12321 ʱ���� while ѭ����ĩβ���ǿ��Եõ� x = 12��revertedNumber = 123��
        // ���ڴ�����λ�����ֲ�Ӱ����ģ����������Լ���ȣ����������ǿ��Լ򵥵ؽ���ȥ����

        return (x == revertedNumber) || (x == revertedNumber / 10);

    }

}
