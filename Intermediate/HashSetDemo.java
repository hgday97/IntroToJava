package Intermediate;

import java.util.*;

// HashSet in Java is a class from the Collections Framework. 
// It allows you to store multiple values in a collection using a hash table. 
// The hash table stores the values in an unordered method with the help of hashing mechanism.

class HashSetDemo {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();  // This means the set is a type of hash set

        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("C");  // Won't be added as it's a duplicate
        // This can be more clearly seen with:
        // boolean r = hashSet.add("C");
        // System.out.println(r); // This will be false, as it's not added

        System.out.println(hashSet);

    }
}