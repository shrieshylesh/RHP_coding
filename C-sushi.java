import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] A = new int[N];
        int[] B = new int[M];
        
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();
        for (int j = 0; j < M; j++) B[j] = sc.nextInt();
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        int i = 0, j = 0, count = 0;
        
        while (i < N && j < M) {
            if (B[j] <= 2 * A[i]) {
                // valid pair → make sushi
                count++;
                i++;
                j++;
            } else {
                // neta too heavy → try bigger shari
                i++;
            }
        }
        
        System.out.println(count);
    }
}
