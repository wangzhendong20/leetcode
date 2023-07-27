import java.util.ArrayList;
import java.util.Arrays;

public class simple1832 {
    public static void main(String[] args) {
        String sentence = "leetcode";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence){
        if (sentence.length() < 26) {
            return  false;
        }

        ArrayList<String> words = new ArrayList<>();
        String[] str = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t",
                "u","v","w","x","y","z"};
        for (int i = 0; i < str.length; i++) {
            words.add(str[i]);
        }

        String[] word = sentence.split("");
        for (String s : word) {
            if (words.contains(s)){
                words.remove(s);
            }
        }
        if (words.isEmpty()){
            return true;
        }
        return false;
    }
}
