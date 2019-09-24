import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        array.add("Apple");
        array.add("Grape");
        array.add("Mango");
        array.add("Melon");
        System.out.println("Input: " + array.toString());
        array.set(0, "Kiwi");
        array.set(2, "Mango");
        System.out.println("Output: " + array.toString());
    }
}
