import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // rows
        int m = sc.nextInt(); // columns

        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for (int j = 0; j < m; j++) {
            int maxVal = a[0][j];

            for (int i = 1; i < n; i++) {
                maxVal = Math.max(maxVal, a[i][j]);
            }

            sum += maxVal;
        }

        System.out.println(sum);
    }
}
