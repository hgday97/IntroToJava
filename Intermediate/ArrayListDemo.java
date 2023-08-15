package Intermediate;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>(5);  // LHS (List) is the interface, RHS (ArrayList) is the concrete implementation
        // Initialising size of arraylist as above is good practice, though it won't get mad if you add more values than the size - it's just a starter

        for (int i = 1; i <= 5; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList);

        arrayList.remove(3); // This will remove 4, as it's the 3rd element (0th included) of the array list

        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
