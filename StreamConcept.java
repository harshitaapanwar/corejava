package javaConcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamConcept {
 public static void main(String[] args) {
	 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

     // Using Stream API to filter, map, and collect the results
     List<Integer> result = numbers.stream()        // Convert list to Stream
                                   .filter(n -> n % 2 == 0) // Filter even numbers
                                   .map(n -> n * n)          // Square the numbers
                                   .collect(Collectors.toList()); // Collect results to a list

     System.out.println(result);
}
}
