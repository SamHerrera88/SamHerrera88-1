import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendLetter {

    // Create a method called "appendA()" that adds "a" to every string in the "far" list.
    // The parameter should be a list.

    public static void main(String[] args) {
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");

        System.out.println(appendA(far));
    }

    public static List<String> appendA(List<String> missingA) {
        List<String> list = new ArrayList<>();
        for (Object str : missingA) {
            list.add(str.toString() + "a");
        }
        return list;
    }
}
