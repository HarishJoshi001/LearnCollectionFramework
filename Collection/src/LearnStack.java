import java.util.Stack;

public class LearnStack {
    public static void main(String[] args){
        // LIFO
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Cat");
        animals.push("Dog");
        animals.push("Horse");

        System.out.println(animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals.peek());
        System.out.println(animals);
    }
}
