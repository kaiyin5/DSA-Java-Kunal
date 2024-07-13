public class Flooring {
    public static void main(String[] args) {
        // assume ascending sort
        int[] arr = {};
        int target = 0;
        System.out.println(floor(arr, target));
    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
