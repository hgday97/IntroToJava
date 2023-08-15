package Intermediate;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo { // Streams work with small chunks of memory at a time, like a 'streaming' service
    public static void main(String args[]) {
        List<Integer> numbersList = new ArrayList<Integer>();

        Collections.addAll(numbersList,10,20,30,40);

        // List<Integer> squaresList = new ArrayList<Integer>();  // The archaic way of squaring each element
        // for(Integer i : numbersList) {
        //     squaresList.add(i*i); 
        // }

        List<Integer> squaresList = numbersList.stream().map(x -> x*x).collect(Collectors.toList());  // Instead we use a stream
        // collect is the final method you can call in the stream, as it will no longer be considered a stream afterwards
        System.out.println("List of squared numbers: " + squaresList);

        List<String> languages = new ArrayList<>();
        languages.add("java");
        languages.add("python");
        languages.add("go");

        List<String> filterResult = languages.stream().filter(s->s.startsWith("p")).collect(Collectors.toList());
        System.out.println("Languages starting with p: " + filterResult);

        List<String> filterResults = languages.stream().filter(a->a.contains("on")).collect(Collectors.toList());
        System.out.println("Languages containing on: " + filterResults);

        List<String> sortedList = languages.stream().sorted().collect(Collectors.toList());
        System.out.println("Languages sorted alphabetically: " + sortedList);

        System.out.println("Printing all elements one by one: ");
        languages.stream().forEach(y -> System.out.println("element is: " + y));

        int sum = numbersList.stream().reduce(0,(ans, i) -> ans + i);
        System.out.println("sum of all elements in the numberlist: " + sum);

    }
}
