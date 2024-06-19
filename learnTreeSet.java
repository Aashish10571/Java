import java.util.Set;
import java.util.TreeSet;

public class learnTreeSet {
    public static void main(String[] args) {
        System.out.println();

        Set<Integer> set = new TreeSet<>();

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
