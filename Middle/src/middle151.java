public class middle151 {
//    public static String reverseWords(String s) {
//        String[] strings = s.split(" ");
//        for (String string : strings) {
//            System.out.println(string);
//        }
//        StringBuffer res = new StringBuffer();
//        for (int i = strings.length -1; i >=0 ; i--) {
//            if (!strings[i].equals("")){
//                res.append(strings[i]);
//                res.append(" ");
//            }
//        }
//        String s1 = res.toString();
//        s1 = s1.strip();
//        return s1;
//    }
//
//    public static void main(String[] args) {
//        String s = "a good   example";
//        String res = reverseWords(s);
//        System.out.println(res);
//
//    }

    public String reverseWords(String s){
        StringBuffer sb = removeSpace(s);
        reverseString(sb,0,sb.length()-1);
        reverseEachWord(sb);
        return sb.toString();
    }

    private StringBuffer removeSpace(String s){
        int start = 0;
        int end = s.length() - 1;
        while (s.charAt(start) == ' ') start++;
        while (s.charAt(end) == ' ') end--;
        StringBuffer sb = new StringBuffer();
        while (start <= end){
            char c = s.charAt(start);
            if(c != ' ' || sb.charAt(sb.length()-1) != ' '){
                sb.append(c);
            }
            start++;
        }
        return sb;
    }

    private void reverseString(StringBuffer sb, int start, int end){
        while (start < end){
            char tmp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end,tmp);
            start++;
            end--;
        }
    }

    private void reverseEachWord(StringBuffer sb){
        int start = 0;
        int end = 1;
        int n = sb.length();
        while (start < n){
            while (end < n && sb.charAt(end) != ' '){
                end++;
            }
            reverseString(sb,start,end-1);
            start = end + 1;
            end = start + 1;
        }
    }
}
