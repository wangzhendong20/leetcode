public class simple2042 {
    public static void main(String[] args) {
        String s = "hello world 5 x 5";
        System.out.println(areNumbersAscending(s));
    }

    public static boolean areNumbersAscending(String s) {
        String[] s1 = s.split(" ");
        boolean judge = true;
        int num = 0;
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s1[i].length(); j++) {
                if (!Character.isDigit(s1[i].charAt(j))){
                    judge = false;
                    break;
                }
            }
            if (judge){
                int res = Integer.valueOf(s1[i]);
                if (res <= num){
                    return false;
                }else {
                    num = res;
                }
            }
            judge = true;
        }
        return true;
    }
}
