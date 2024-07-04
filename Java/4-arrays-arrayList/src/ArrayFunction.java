import java.util.Arrays;

public class ArrayFunction {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        swap(arr, 4, 2);
        System.out.println(Arrays.toString(arr));
        System.out.println(findMax(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int num = 1; num < arr.length; num++) {
            if (arr[num] > max) {
                max = arr[num];
            }
        }
        return max;
    }

    static void reverseArray(int[] arr) {
        // using two pointers
        int start = 0;
        int end = arr.length - 1;
        while (end > start) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
