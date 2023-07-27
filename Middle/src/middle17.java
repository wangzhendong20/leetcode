import java.util.ArrayList;
import java.util.List;

public class middle17 {
    List<String> res = new ArrayList<>();
    String[] strings = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    StringBuffer s = new StringBuffer();
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return res;
        backtracking(digits,0);
        return res;

    }

    private void backtracking(String digits, int index){
        if (index == digits.length()){
            res.add(s.toString());
            return;
        }
        int digit = digits.charAt(index) - '0';
        String letters = strings[digit];
        for (int i = 0; i < letters.length(); i++) {
            s.append(letters.charAt(i));
            backtracking(digits,index+1);
            s.deleteCharAt(s.length()-1);
        }
    }
}
