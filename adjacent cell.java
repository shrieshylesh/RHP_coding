import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] mat = new int[rows][cols];

        // Input matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int maxSum = 0;

        // Find maximum 2x2 adjacent cell sum
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {

                int sum = mat[i][j]
                        + mat[i][j + 1]
                        + mat[i + 1][j]
                        + mat[i + 1][j + 1];

                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println(maxSum);
    }
}
