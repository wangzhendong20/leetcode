public class simple392 {
    public boolean isSubsequence(String s, String t) {
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean flag = false;
            char c = s.charAt(i);
            while (j<t.length()){
                if (c == t.charAt(j)){
                    flag = true;
                    j++;
                    break;
                }
                j++;
            }
            if (!flag){
                return false;
            }
        }

        return true;
    }

    public boolean isSubsequence2(String s, String t) {
        int m = s.length();
        int n = t.length();
        int i=0,j=0;
        while (i<m && j<n){
            if (s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }

        return i == m;
    }

    public boolean isSubsequence3(String s, String t) {
        int[][] dp = new int[s.length()+1][t.length()+1];

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= t.length(); j++) {
                if (s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else {
                    dp[i][j] = dp[i][j-1];
                }
            }
        }

        return dp[s.length()][t.length()] == s.length();
    }
}
