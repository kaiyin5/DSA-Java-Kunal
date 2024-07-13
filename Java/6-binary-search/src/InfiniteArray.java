public class InfiniteArray {
    public static void main(String[] args) {
        // we assumed the array.length is infinite
        // which ignored the out of bound problem
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int target = -1;
        System.out.println(findAns(array, target));
    }

    static int findAns(int[] arr, int target) {
        int start = 0, end = 1;
        // find the range where target is located
        // by doubling the size of range
        // until the end element is larger than the target
        while(target > arr[end]) {
           int newStart = end + 1;
           // new end index = end index + 2 * range size
           end = end + (end - start + 1) * 2;
           start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
