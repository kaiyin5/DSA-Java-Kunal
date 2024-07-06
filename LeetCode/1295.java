// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int num : nums) {
            int digit = 0;
            do {
                num /= 10;
                digit++;
            } while (num >= 1);
            if (digit % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }
}