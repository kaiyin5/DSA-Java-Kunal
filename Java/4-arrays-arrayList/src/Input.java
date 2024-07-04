import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // array of primitives
        int[] arr = new int[3];
        arr[0] = 23;
        arr[2] = 67;
        System.out.println(Arrays.toString(arr));

        // assign value of arr via for loop
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = in.nextInt();
        }

        // foreach loop: for every num in arr
        for (int num : arr) {
            System.out.print(num + " ");
        }

//        System.out.println(arr[5]); // index out of bound error

        // array of in-primitives
        String[] str = new String[4];
        for (int i = 0; i < str.length ; i++) {
            str[i] = in.next();
        }

        // modify: the object's value is re-assigned
        str[2] = "Kai";

        System.out.println(Arrays.toString(str));
    }
}
