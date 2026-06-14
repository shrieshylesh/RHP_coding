class Solution {

    private int[][] dp;
    private int[][] matrix;
    private int rows;
    private int cols;

    private final int[][] directions = {
        {1, 0},
        {-1, 0},
        {0, 1},
        {0, -1}
    };

    public int longestIncreasingPath(int[][] matrix) {

        this.matrix = matrix;
        rows = matrix.length;
        cols = matrix[0].length;

        dp = new int[rows][cols];

        int answer = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                answer = Math.max(answer, dfs(i, j));
            }
        }

        return answer;
    }

    private int dfs(int r, int c) {

        if (dp[r][c] != 0) {
            return dp[r][c];
        }

        int maxLen = 1;

        for (int[] dir : directions) {

            int nr = r + dir[0];
            int nc = c + dir[1];

            if (nr >= 0 && nr < rows &&
                nc >= 0 && nc < cols &&
                matrix[nr][nc] > matrix[r][c]) {

                maxLen = Math.max(maxLen, 1 + dfs(nr, nc));
            }
        }

        dp[r][c] = maxLen;
        return maxLen;
    }
}
