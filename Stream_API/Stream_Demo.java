package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Stream_Demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        Stream<Integer> s1 = nums.stream();
        Predicate<Integer> p = new Predicate<Integer>() {
            public boolean test(Integer n) {
                if (n % 2 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0); // it filter even number
        Stream<Integer> s2 = s1.filter(p); // it filter even number

        Stream<Integer> s3 = s2.map(n -> n * 2); // it doubled the element
        int sum = s3.reduce(0, (c, e) -> c + e); // it will add element
        System.out.println("Total : " + sum);

        // here we can reduce our code by doing this
        int total = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);
        System.out.println("Sum : " + total);
        System.out.println("\nSorted Numbers : \n");
        Stream<Integer> st1 = nums.stream()
                .filter(n -> n % 2 == 1)
                .sorted();
        st1.forEach(n -> System.out.print(n + " "));

    }
}
