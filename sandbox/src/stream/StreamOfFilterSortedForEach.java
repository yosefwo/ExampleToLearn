package stream;

import java.util.Arrays;
import java.util.List;

public class StreamOfFilterSortedForEach {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("yael",
                "dvir", "sivan");
        names.stream()
                .filter( s -> s.contains("a"))
                .forEach( s -> System.out.println(s) );
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        names.stream()
                .filter( s -> s.contains("a"))
                .sorted()
                .forEach( s -> System.out.println(s) );

    }
}
