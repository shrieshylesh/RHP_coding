class Solution {

    public int longestCommonSubstring(String s1, String s2) {

        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        int max = 0;

        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {

                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;

                    if (dp[i][j] > max) {
                        max = dp[i][j];
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return max;
    }
}
