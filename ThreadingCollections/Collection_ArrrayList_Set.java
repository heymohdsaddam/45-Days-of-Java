package ThreadingCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection_ArrrayList_Set {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(4);
        nums.add(7);
        nums.add(6);
        nums.add(1);
        nums.add(3);
        nums.add(5);

        System.out.println(nums);
        // for (Integer integer : nums) {
        // System.out.println(integer);
        // }

        Set<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        numbers.add(1);
        System.out.println(numbers);

    }
}
