import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        // only number of row is a must
//        int[][] arr = new int[3][];
        int[][] arr = {
                {1, 2},
                {3, 4, 5, 6},
                {7, 8, 9}
        };
        Scanner in = new Scanner(System.in);
        // assigning new values
        for (int row = 0; row < arr.length; row++) {
            System.out.println("enter " + arr[row].length + " numbers:");
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
