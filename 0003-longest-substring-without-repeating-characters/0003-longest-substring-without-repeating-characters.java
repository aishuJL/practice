
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) return 0;

        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        String s = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(s);
        
        System.out.println("The length of the longest substring without repeating characters is: " + result);
    }
}