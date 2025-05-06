package javaConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorConcept {
  public static void main(String[] args) {
	  Comparator<Integer> com = new Comparator<Integer>() {
		  public int compare(Integer i, Integer j) {
			  if(i%10>j%10) 
				  return 1;
			  else
				  return -1;
		  }
	  };
	  
	  List<Integer> nums = new ArrayList<>();
      nums.add(23);
      nums.add(31);
      nums.add(72);
      nums.add(29);

      Collections.sort(nums, com);
      System.out.println("Sorted by last digit:");
      System.out.println(nums);
}
}
