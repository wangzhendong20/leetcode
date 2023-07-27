public class simple541 {
    public String reverseStr(String s, int k) {
        StringBuffer res = new StringBuffer();
        int start = 0;
        int length = s.length();
        while (start<length){
            int firstk = (start + k > length) ? length : start + k;
            int secondk = (start + 2*k > length) ? length : start + 2*k;
            StringBuffer tmp = new StringBuffer();
            tmp.append(s.substring(start,firstk));
            res.append(tmp.reverse());

            if (firstk < secondk){
                res.append(s.substring(firstk,secondk));
            }
            start += 2*k;
        }
        return res.toString();
    }
}
