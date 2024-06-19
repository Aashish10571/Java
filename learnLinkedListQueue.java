import java.util.LinkedList;
import java.util.Queue;

public class learnLinkedListQueue {
    public static void main(String[] args) {
        System.out.println();

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println(queue);

        System.out.println("Element that is coming out of the queue : " + queue.peek());

        System.out.println("Removing : " + queue.poll() + " from the queue");

        System.out.println(queue);
    }
}
