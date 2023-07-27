public class simple2185 {
    public static void main(String[] args) {

    }

    public static int prefixCount(String[] words, String pref){
        int res=  0;
        for (String s:words
             ) {
            if (s.startsWith(pref)){
                res++;
            }
        }
        return res;
    }
}
