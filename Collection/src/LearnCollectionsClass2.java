import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionsClass2 {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Anuj", 2));
        list.add(new Student("Ramesh", 4));
        list.add(new Student("Shivam", 3));
        list.add(new Student("Rohit", 1));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        /*
        @Override
        public int compareTo(Student o) {
        return this.rollNo - o.rollNo;
        }
        this piece of code is in Student class to compare the objects with respect to roll no.
         */


        //the above thing can also be done in the following way
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(list);
        //this sorting is done with name but we can do it considering roll no as well
        //return o1.rollNO - o2.rollNo
        //this can be used to compare using roll no
    }
}
