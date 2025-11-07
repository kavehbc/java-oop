package S21_data_structures;
import java.util.LinkedList;
import java.util.ListIterator;

import S05_user_inputs.Terminal;

public class LinkListDemo {
    public static void main(String[] args) {
        Terminal.clear();

        // Example #1
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.addLast(2);
        ll.addFirst(3);
        ll.add(3, 4);
        ll.add(1, 5);

        // [3, 5, 1, 2, 4]
        // print the linked list
        System.out.println(ll);

        // iterate using for loop
        Integer val;
        ListIterator<Integer> it = ll.listIterator();
        while (it.hasNext()) {
            val = it.next(); // we get the value
            System.out.println(val);
        }

        System.out.println("***************");

        // Example #2
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("John");
        staff.addLast("Daniel");
        staff.addLast("Harry");
        staff.addLast("Tom");
        System.out.println(staff);

        // JDHT
        ListIterator<String> iterator = staff.listIterator();
        iterator.next(); // J|DHT
        iterator.next(); // JD|HT

        iterator.add("Smith"); // JDS|HT
        iterator.add("Nina"); // JDSN|HT

        iterator.previous(); // JDS|NHT - pointing to Nina
        iterator.set("Paul"); // JDSP|HT - updating Nina to Paul

        iterator.next();
        iterator.next();
        iterator.remove(); // JDSP|T - removing H

        System.out.println(staff);


    }
}
