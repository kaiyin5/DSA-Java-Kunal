import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int arrRow = 3;
        // initialisation
        for (int row = 0; row < arrRow; row++) {
            list.add(new ArrayList<>());
        }
        Scanner in = new Scanner(System.in);

        // add elements
        for (int row = 0; row < arrRow; row++) {
            System.out.println("Enter 3 numbers for the " + (row + 1) + "th row.");
            for (int col = 0; col < 3; col++) {
                list.get(row).add(in.nextInt()); // if the ArrayList inside list isn't init, cant use get method
            }
        }
        System.out.println(list);
    }
}
