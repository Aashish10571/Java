import java.util.ArrayDeque;

public class learnArrayDeque {
    public static void main(String[] args) {
        System.out.println();

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.offer(1);
        deque.offerFirst(0);
        deque.offerLast(2);
        deque.offer(3);

        System.out.println(deque);
        System.out.println();

        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println();

        System.out.println(deque.poll());
        System.out.println(deque);

        System.out.println(deque.pollFirst());
        System.out.println(deque);

        System.out.println(deque.pollLast());
        System.out.println(deque);
    }
}