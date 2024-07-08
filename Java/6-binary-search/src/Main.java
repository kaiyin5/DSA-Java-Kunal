public class Main {
    public static void main(String[] args) {
        int[] arr = {-4, -3, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 27, 55, 88};
        System.out.println(binarySearch(arr, 999));
    }

    // return the index if target is found, else return -1
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
//            int mid = (start + end) / 2; // this may possibly exceed the limit of int
            // better formula
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
