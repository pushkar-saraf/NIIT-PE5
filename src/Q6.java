import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Q6 {
    public static void main(String[] args) {
        System.out.print("Input: ");
        String input = "Harry Olive Alice Bluto Eugene";
        System.out.println(input);
        System.out.println("Output: ");
        System.out.print("Sorted Set:");
        SortedSet<String> set = new TreeSet<>(Arrays.asList(input.split(" ")));
        System.out.println(set);
        ArrayList<String> fromSet = new ArrayList<>(set);
        System.out.println("ArrayList from Set: " +fromSet);
    }
}
