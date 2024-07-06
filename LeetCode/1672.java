// https://leetcode.com/problems/richest-customer-wealth/description/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int wealth = 0;
            for (int money : account) {
                wealth += money;
            }
            if (wealth > max) {
                max = wealth;
            }
        }
        return max;
    }
}