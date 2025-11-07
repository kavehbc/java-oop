package S21_data_structures;
import java.util.HashSet;
import java.util.TreeSet;

import S05_user_inputs.Terminal;

import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Terminal.clear();
        // HashSet
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(2); // this add will be ignored, because it is duplicated
        hashSet.add(4);
        hashSet.remove(3);

        System.out.println(hashSet);

        // TreeSet
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(2); // this add will be ignored, because it is duplicated
        treeSet.add(6);
        treeSet.remove(4);

        System.out.println(treeSet);
    }
}
