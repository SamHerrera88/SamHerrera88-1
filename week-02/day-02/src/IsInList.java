import java.util.ArrayList;
import java.util.Arrays;

public class IsInList {

    // Check if list contains all of the following elements: 4,8,12,16
    // Create a method that accepts list as an input
    // it should return "true" if it contains all, otherwise "false"

    public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 7, 8, 10, 12, 14, 16));
            System.out.println(checkNums(list));
    }

    public static boolean checkNums(ArrayList<Integer> list){
            ArrayList<Integer> subList = new ArrayList<>(Arrays.asList(4, 8, 12, 16));
            return list.containsAll(subList);
        }
}
