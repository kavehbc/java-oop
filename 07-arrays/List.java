import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        System.out.println("List of items:");
        
        // Example #1: Using an array
        String[] items = {"Apple", "Banana", "Cherry"};
        for (String item : items) {
            System.out.println("- " + item);
        }
        System.out.println("Total items: " + items.length);

        System.out.println();

        // Example #2: Using an array with indices
        String[] moreItems = new String[3];
        moreItems[0] = "Dog";
        moreItems[1] = "Elephant";
        moreItems[2] = "Frog";
        for (int i = 0; i < moreItems.length; i++) {
            System.out.println((i + 1) + ". " + moreItems[i]);
        }
        System.out.println("Total items: " + moreItems.length);

        System.out.println();
        // Example #3: Using ArrayList with dynamic sizing
        ArrayList<String> itemList = new ArrayList<>();

        // reading data from input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter items (type 'exit' to finish):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            itemList.add(input);
        }

        System.out.println("You entered:");

        // printing the items
        // option 1: using for loop with index
        for (int i = 0; i < itemList.size(); i++) {
            System.out.println((i + 1) + ". " + itemList.get(i));
        }

        System.out.println();

        // option 2: using enhanced for loop
        // similar to foreach in other languages
        int counter = 0;
        for (String item : itemList) {
            System.out.println(counter + ". " + item);
            counter++;
        }
        
        System.out.println("Total items: " + itemList.size());

        // to remove an item
        System.out.print("Enter the index of the item to remove: ");
        int indexToRemove = scanner.nextInt();
        if (indexToRemove >= 0 && indexToRemove < itemList.size()) {
            itemList.remove(indexToRemove);
            System.out.println("Item removed.");
        } else {
            System.out.println("Invalid index.");
        }

        System.out.println("Updated list:");
        for (int i = 0; i < itemList.size(); i++) {
            System.out.println((i + 1) + ". " + itemList.get(i));
        }
        System.out.println("Total items: " + itemList.size());

        /*
         * add more items without index
         * itemList.add("NewItem");
         * 
         * remove an item by index
         * itemList.remove(0);
         * 
         * get an item by index
         * String item = itemList.get(0);
         * 
         * add to the list using index
         * itemList.add(1, "NewItem");
         * 
         * update an item
         * itemList.set(0, "UpdatedItem");
         */
        
        scanner.close();
    }
}
