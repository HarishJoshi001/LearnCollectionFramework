import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<String> studentName = new ArrayList<>();
        studentName.add("John");
        studentName.add("Jane");
        studentName.add("Bob");
        System.out.println(studentName);
        System.out.println(studentName.get(0));
        // student.add adds at the item at the end of the arraylist
        studentName.add(1, "Harry");
        System.out.println(studentName);

        List<String> newList = new ArrayList<>();
        newList.add("Hello");
        newList.add("World");
        newList.add("Yo");

        studentName.addAll(newList);
        System.out.println(newList);
        System.out.println(studentName);

        studentName.remove(2);
        System.out.println(studentName);
        //removes the element of the index

        studentName.remove(String.valueOf("Yo"));
        System.out.println(studentName);
        // removes the element of value

        studentName.set(2, "Oggy");
        System.out.println(studentName);

        System.out.println(studentName.contains("Harry"));

        System.out.println(" \n--for loop--");
        for(int i=0; i<studentName.size(); i++){
            System.out.println(studentName.get(i));
        }

        System.out.println(" \n--for each--");
        for(String name : studentName){
            System.out.println(name);
        }

        System.out.println(" \n--iterator--");
        Iterator<String> it = studentName.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        studentName.clear();
        System.out.println(studentName);

    }
}