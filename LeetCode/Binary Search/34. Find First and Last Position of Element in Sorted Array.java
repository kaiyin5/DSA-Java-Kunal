class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length < 1) {
            return new int[] { -1, -1 };
        } else {
            return new int[] { binarySearch(nums, target, true), binarySearch(nums, target, false) };
        }
    }

    static int binarySearch(int[] nums, int target, boolean isFirst) {
        int start = 0, end = nums.length - 1, mid = 0;
        if (isFirst) {
            if (target > nums[nums.length - 1]) {
                return -1;
            }
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            if (nums[start] == target) {
                return start;
            } else {
                return -1;
            }
        } else {
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            if (end < 0) {
                return -1;
            } else {
                if (nums[end] == target) {
                    return end;
                } else {
                    return -1;
                }
            }
        }
    }
}