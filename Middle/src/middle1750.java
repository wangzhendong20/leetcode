public class middle1750 {
    public static void main(String[] args) {
        String s = "bbbbbbbbbbbbbbbbbbbbbbbbbbbabbbbbbbbbbbbbbbccbcbcbccbbabbb";
        System.out.println(minimumLength(s));
    }

    public static int minimumLength(String s) {
        int i = 0;
        int j = s.length()-1;
        while (i<j && s.charAt(i) == s.charAt(j)){
            char c = s.charAt(i);
            while (i<=j && s.charAt(i) == c){
                i++;
            }
            while (i<=j && s.charAt(j) == c){
                j--;
            }
        }
        return j-i+1;
    }
}
