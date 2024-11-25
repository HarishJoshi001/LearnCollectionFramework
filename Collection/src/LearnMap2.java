import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap2 {

    public static void main(String[] args) {

        Map<String, Integer> numbers = new TreeMap<>();

        //treemap arranges the keys in alphabetical order
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);

        System.out.println(numbers);

        numbers.remove("Three");
        System.out.println(numbers);
    }
}
