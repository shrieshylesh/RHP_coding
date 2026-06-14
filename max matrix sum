import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[n][m];

        // First row
        for (int j = 0; j < m; j++) {
            dp[0][j] = a[0][j];
        }

        // DP
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {

                int best = 0;

                for (int k = 0; k < m; k++) {
                    if (k != j) {
                        best = Math.max(best, dp[i - 1][k]);
                    }
                }

                dp[i][j] = a[i][j] + best;
            }
        }

        int ans = 0;

        for (int j = 0; j < m; j++) {
            ans = Math.max(ans, dp[n - 1][j]);
        }

        System.out.println(ans);
    }
}
