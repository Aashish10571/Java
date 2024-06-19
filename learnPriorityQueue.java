import java.util.Comparator;
import java.util.PriorityQueue;

public class learnPriorityQueue {
    public static void main(String[] args) {
        System.out.println();

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        queue.offer(6);
        queue.offer(5);
        queue.offer(1);
        queue.offer(4);
        queue.offer(2);
        queue.offer(3);

        System.out.println(queue);

        System.out.println("Element that is coming out of the queue : " + queue.peek());
        System.out.println("Removing : " + queue.poll());

        System.out.println(queue);
    }
}
