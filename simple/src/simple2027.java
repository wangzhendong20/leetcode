public class simple2027 {
    public static void main(String[] args) {
        String s = "XXOX";
        System.out.println(minimumMoves(s));
    }

    public static int minimumMoves(String s){
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != 'O'){
                num++;
                i = i + 2;
            }
        }
        return num;
    }

}



