package java_8.streams_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamOps {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 3, 5, 7, 6, 4, 8, 9, 5, 3, 2, 2, 6, 8, 0);
        List<Integer> filteredMappedList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .distinct()
                .sorted((a, b) -> (b - a))
                .limit(4)
                .skip(1)
                .collect(Collectors.toList());
//        System.out.println(filteredMappedList);

        long count = Stream
                .iterate(0, x -> x + 1)
                .filter(x -> x % 2 == 0)
                .limit(101)
                .skip(1)
                .map(x -> x / 10)
                .distinct()
                .sorted((a, b) -> (b - a))
                .peek(System.out::println)
                .count();
        System.out.println(count);

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 10);
        List<Integer> collect = list1
                .parallelStream()
                .map(x -> x * 5)
                .peek(x-> System.out.println(Thread.currentThread().getName()+"- "+x))
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
