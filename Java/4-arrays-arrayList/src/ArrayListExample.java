import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Dynamic array = Arraylist
        // Syntax: ArrayList<WrapperClass> refVarName = new ArrayList<>(size);
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(23);
        list.add(16);
        list.add(39);
        System.out.println(list);

    }
}
