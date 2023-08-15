package Intermediate;

import java.util.LinkedList;

public class LinkedListDemo {
    // NOTE: Implementation is not synchronized,  so if multiple threads are modiying a Linked List
    // You can't just get an element if you know it's position like an arraylist
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("A");
        list.add("B");
        System.out.println(list);
        
        list.addLast("C");
        System.out.println(list);

        list.addFirst("D");
        System.out.println(list);
        
        list.add(2, "E");
        System.out.println(list);

        list.remove("B");
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);
    }
}
