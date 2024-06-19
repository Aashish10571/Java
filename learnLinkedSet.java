import java.util.LinkedHashSet;
import java.util.Set;

public class learnLinkedSet {
    public static void main(String[] args) {
        System.out.println();

        Set<Integer> set = new LinkedHashSet<>();

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);

        System.out.println(set);
        System.out.println();

        set.remove(54);

        System.out.println(set);
        System.out.println();

        System.out.println("100 contains in set : " + set.contains(100));
        System.out.println();

        System.out.println("Size of the set : " + set.size());
        System.out.println();

        set.clear();
        System.out.println(set);
    }
}
