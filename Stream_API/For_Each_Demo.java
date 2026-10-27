package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class For_Each_Demo {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16, 18, 20);
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + "  ");
        }

        System.out.println("\nUsing enhance for loop : ");

        for (Integer integer : nums) {
            System.out.print(integer + "  ");
        }
        // like we want to perform operation like want to find even number then double
        // it, then add these number
        int sum = 0;
        for (Integer integer : nums) {
            if (integer % 2 == 0) {
                integer *= 2;
                sum += integer;
            }
        }
        System.out.println("\nprinting sum : " + sum);
        Consumer<Integer> com = new Consumer<Integer>() {
            public void accept(Integer n) {
                System.out.print(n + "  ");
            }
        }; // as it has a single functional interfec then we can reduce by usig labda
           // expression
        Consumer<Integer> com1 = n -> System.out.print(n + "  ");
        // as it has a single functional interfec then we can reduce by usig labda
        // expression
        System.out.println("\nUsing for each loop : ");
        nums.forEach(n -> System.out.print(n + "  "));
        System.out.println("\nUsing Consumer Interfec : ");
        nums.forEach(com);
        System.out.println("\nUsing Consumer : ");
        nums.forEach(com1);
        // we put n -> System.out.print(n + " "); inside the nums.forEach() it works as
        // object of consumer
        System.out.println(
                "\nUsing consumer object then labda expression of that object then passing on nums.forEach :");
        nums.forEach(n -> System.out.print(n + "  "));

    }
}
