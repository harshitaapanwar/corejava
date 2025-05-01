package javaConcept;

import java.util.ArrayList;
import java.util.Collection;

public class Collectons {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(3);
        nums.add(8);

        System.out.println(nums);  // Output: [6, 5, 3, 8]
    }
}
