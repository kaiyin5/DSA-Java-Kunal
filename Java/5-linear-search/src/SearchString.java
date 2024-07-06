public class SearchString {
    public static void main(String[] args) {
        String str = "Louis";
        char target = 'U';
        System.out.println(searchString(str, target));
    }

    static boolean searchString(String str, char target) {
        for (char letter : str.toCharArray()) {
            if (letter == target) {
                return true;
            }
        }
        return false;
    }
}
