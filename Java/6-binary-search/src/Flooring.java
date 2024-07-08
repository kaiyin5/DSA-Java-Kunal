public class Flooring {
    public static void main(String[] args) {
        // assume ascending sort
        int[] arr = {1, 3, 4, 9, 10, 13, 15, 19, 22};
        int target = 11;
        System.out.println(findCeilingBS(arr, target));
    }

    static int findCeilingBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return arr[mid];
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[end];
    }
}
