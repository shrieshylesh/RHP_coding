import java.util.*;

public class LongestEqualSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();   // input binary string (only 0s and 1s)

        // Map to store first occurrence of (ones - zeros)
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);   // base case: diff = 0 at index -1

        int zeros = 0, ones = 0;
        int maxLen = 0, startIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                zeros++;
            } else {
                ones++;
            }

            int diff = ones - zeros;

            if (map.containsKey(diff)) {
                int prevIndex = map.get(diff);
                int length = i - prevIndex;
                if (length > maxLen) {
                    maxLen = length;
                    startIndex = prevIndex + 1;
                }
            } else {
                map.put(diff, i);
            }
        }

        System.out.println("Length = " + maxLen);
        if (maxLen > 0) {
            System.out.println("Substring = " + s.substring(startIndex, startIndex + maxLen));
        } else {
            System.out.println("No equal 0s and 1s substring found.");
        }
    }
}
