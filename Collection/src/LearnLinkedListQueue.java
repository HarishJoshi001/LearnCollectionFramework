import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        //FIFO
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        System.out.println(queue.poll());
        //this removes an element and also returns it

        System.out.println(queue);

        System.out.println(queue.peek());
        //this tells us which element is next in line to be removed or polled

        //queue has other functions like add, element, remove
        //read these online
    }
}
