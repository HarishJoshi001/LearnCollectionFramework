import java.util.HashMap;
import java.util.Map;

public class LearnMap {

    public static void main(String[] args) {

        Map<String, Integer> numbers = new HashMap<>();
        //key value pair
        //keys are unique but values can be same as well
        //keys that are duplicate have their values overridden with the value of recent key

        numbers.put("One", 1);
        numbers.put("Two", 4);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);

        numbers.put("Two", 2);
        System.out.println(numbers);

        if(!numbers.containsKey("Two")){
            numbers.put("Two", 23);
        }
        System.out.println(numbers);
        System.out.println(numbers.containsValue(2));
        System.out.println(numbers.isEmpty());
        //there is a clear function as well

        numbers.putIfAbsent("Two", 24);
        System.out.println(numbers+"\n");

        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        System.out.println("");
        for (String key : numbers.keySet()) {
            System.out.println(key);
        }

        System.out.println("");
        for (Integer value : numbers.values()){
            System.out.println(value);
        }

    }
}
