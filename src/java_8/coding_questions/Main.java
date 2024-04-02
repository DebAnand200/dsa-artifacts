package java_8.coding_questions;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Fibonacci Series
        Stream.iterate(new int[] {0,1}, f->new int[] {f[1], f[0]+f[1]})
                .limit(10)
                .map(f -> f[0])
                .forEach(System.out::println);


    }

}
