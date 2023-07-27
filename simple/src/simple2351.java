import java.util.HashSet;

public class simple2351 {
    public static void main(String[] args) {

    }

    public char repeatedCharacter(String s){
        HashSet<Character> set = new HashSet<>();
        char c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }else {
                c = s.charAt(i);
                break;
            }
        }
        return c;
    }
}
