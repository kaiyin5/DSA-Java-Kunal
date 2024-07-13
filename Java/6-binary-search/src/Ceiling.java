public class Ceiling {
    public static void main(String[] args) {
        // assume ascending sort
        int[] arr = {};
        int target = 1;
        System.out.println(ceiling(arr, target));
    }

    static int ceiling(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
