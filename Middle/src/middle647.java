public class middle647 {
    public int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int res = 0;

        for (int i = s.length()-1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)){
                    if (j - i <= 1){
                        res++;
                        dp[i][j] = true;
                    }else {
                        if (dp[i+1][j-1]){
                            res++;
                            dp[i][j] = true;
                        }
                    }
                }
            }
        }

        return res;
    }

    public int countSubstrings2(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += extend(s,i,i,s.length());
            res += extend(s,i,i+1,s.length());
        }

        return res;
    }

    private int extend(String s, int i, int j, int n) {
        int result = 0;

        while (i >= 0 && j < n && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
            result++;
        }

        return result;


    }
}
