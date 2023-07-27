public class simple58 {
    public String reverseLeftWords(String s, int n) {
//        if (s == null || n > s.length()){
//            return null;
//        }
//        String s1 = s.substring(0,n-1);
//        String s2 = s.substring(n,s.length()-1);
//        return s2+s1;
        int len = s.length();
        StringBuffer sb = new StringBuffer(s);
        reverse(sb,0,n-1);
        reverse(sb,n,sb.length()-1);
        return sb.reverse().toString();

    }

    private void reverse(StringBuffer sb, int start, int end){
        while (start<end){
            char tmp = sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,tmp);
            start++;
            end--;
        }
    }
}
