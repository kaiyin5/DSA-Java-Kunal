import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {5, 88, 6, 2},
                {1, 8, 8, 5, 4},
                {55, 77}
        };
        int target = 1;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    int[] ans = new int[]{row, col};
                    return ans;
                }
            }
        }
        return new int[]{-1, -1};
    }

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
}
