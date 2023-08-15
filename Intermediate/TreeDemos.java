package Intermediate;

import java.util.TreeSet;
import java.util.TreeMap;

class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();

        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("A");

        System.out.println(treeSet);  // This will order the elements based on the type, for example, alphabetically in this case
    }
}

class TreeMapDemo{
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(3, "A");  // Like a Tree Set, but you provide keys and thus the ordering (unlike the automatic ordering of a Tree Set)
        treeMap.put(2, "B");
        treeMap.put(1, "C");

        System.out.println(treeMap);
    }
}