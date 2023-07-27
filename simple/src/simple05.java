public class simple05 {
    public String replaceSpace(String s) {
        StringBuffer res = new StringBuffer(s);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' '){
                res.append("%20");
            }else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
