class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if (target >= letters[letters.length - 1]) {
            return letters[0];
        }
        int start = 0, end = letters.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target >= letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start];
    }
}