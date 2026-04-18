import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Lamda {

    public static void main(String[] args) {

        // 1. Simple addition
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Addition: " + add.apply(3, 5));

        // 2. Squaring a number
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square: " + square.apply(4));

        // 3. Using lambda with map (Stream API)
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> doubled = numbers.stream()
                                       .map(x -> x * 2)
                                       .collect(Collectors.toList());
        System.out.println("Doubled list: " + doubled);

        // 4. Using lambda with filter
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers2.stream()
                                            .filter(x -> x % 2 == 0)
                                            .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        // 5. Using lambda with sorting
        List<int[]> pairs = new ArrayList<>();
        pairs.add(new int[]{1, 3});
        pairs.add(new int[]{2, 1});
        pairs.add(new int[]{4, 2});

        pairs.sort((a, b) -> Integer.compare(a[1], b[1]));

        System.out.print("Sorted pairs by second value: ");
        for (int[] p : pairs) {
            System.out.print(Arrays.toString(p) + " ");
        }
    }
}