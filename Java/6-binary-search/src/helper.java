public class helper {
    public static void main(String[] args) {
        int[] nums = {1, 3};
        System.out.println(findPivot(nums));
    }

    static int findPivot(int[] nums) {
        int start = 0, end = nums.length - 1, mid = 0;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums [mid - 1] > nums[mid]) {
                return mid - 1;
            }
            if (nums[start] > nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
