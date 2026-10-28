package Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Parallel_Stream_Demo {
    public static void main(String[] args) {
        int size = 10_000;
        Random rand = new Random();
        List<Integer> nums = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            nums.add(rand.nextInt(10));
        }
        // now we have created the huge list now want to add this
        long startSeq = System.currentTimeMillis();
        int sum1 = nums.stream()
                .map(n -> {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {

                    }
                    return n * 2;
                })
                .mapToInt(n -> n)
                .sum();
        long endSeq = System.currentTimeMillis();
        long startPara = System.currentTimeMillis();
        int sum2 = nums.parallelStream()
                .map(n -> {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {

                    }
                    return n * 2;
                })
                .mapToInt(n -> n)
                .sum();
        long endPara = System.currentTimeMillis();

        System.out.println("Sequential Sum : " + sum1 + " and Time : " + (endSeq - startSeq));
        System.out.println("Parallel Sum : " + sum2 + " and Time : " + (endPara - startPara));

    }
}
