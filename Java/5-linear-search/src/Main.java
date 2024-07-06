public class Main {
    public static void main(String[] args) {

        int[] nums = {5, 9, 4, 2, 6};
        int target = 6;
        System.out.println(linearSearch(nums, target));
    }

    static int linearSearch(int[] arr, int target) {
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] == target) {
                return idx;
            }
        }

        return -1;
    }
}
