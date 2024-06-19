import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class learnLinkedList {
    public static void printList(LinkedList<Integer> list) {
        System.out.println();
        System.out.println("Printing the list");
        System.out.print("[ ");
        for (int ele : list) {
            if (ele == list.getLast())
                System.out.print(ele);
            else
                System.out.print(ele + ", ");
        }
        System.out.println(" ]");
    }

    public static void printListIterator(LinkedList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();

        System.out.print("[ ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        System.out.println();

        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list1 = new LinkedList<>();

        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Element at Index 3 : " + list.get(3));

        list.addAll(list1);

        list1.clear();
        printList(list1);
        System.out.println();

        System.out.println("list contains 5 : " + list.contains(5));
        System.out.println();

        System.out.println("Index of 7 : " + list.indexOf(7));

        printList(list);
        System.out.println();

        System.out.println("Printing the list using iterator");
        printListIterator(list);

        list.remove(5);
        list.set(0, 100);
        printList(list);
        System.out.println();

        Collections.sort(list);
        printList(list);
    }
}
