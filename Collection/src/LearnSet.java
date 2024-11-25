import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

    public static void main(String[] args) {

//        Set<Integer> set = new HashSet<>();
        //no duplicates allowed, if duplicates then remove one of the duplicate values
        //hash of an element is created

//        Set<Integer> set = new LinkedHashSet<>();
        //to do this first comment line 10 and 18
        //same as HashSet but holds the order in which the elements are added

        Set<Integer> set = new TreeSet<>();
        //comment line 10 and 14
        //sorts the elements

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(32);
        set.add(65);

        System.out.println(set);

        set.remove(54);
        System.out.println(set);

        System.out.println(set.contains(100));
        System.out.println(set.contains(65));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());
    }
}
