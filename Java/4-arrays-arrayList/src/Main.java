public class Main {
    public static void main(String[] args) {
        // syntax
        // datatype[] var_name = new datatype[size];

        // declaration: rowNo is defined in the stack during compile time
        int[] rowNo;
        // initialisation: object is created in the heap memory during runtime, it's a dynamic memory allocation
        rowNo = new int[5];

        // about the memory of Java
        // 1. array objects are in heap
        // 2. heap objects are not continuous (side by side)
        // 3. dynamic memory allocation
        // Conclusion: arrays may not be continuous, it depends on JVM

        // new is a keyword for creating an object

        // default value of unassigned value in array
        // int: 0; String: null;
        // null is a special value, by-default value, litter and not a datatype
        // null can only be assigned to non-primitives like String

        String[] arr = new String[5];
        // internal working of object
        // arr is stored in stack memory
        // 5 elements of arr is stored in heap
        // Each element is an object which take a separated memory in heap
        // arr[n] is the ref. var. of the element
    }

}
