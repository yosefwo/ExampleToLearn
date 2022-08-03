package stream;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class NaturalNumbers
        implements Supplier<Integer> {
    private static int count;
    private int i = 0;
    public Integer get() { return ++i; }

    public static void main(String[] args) {
        int i = 0;
        Stream<Integer> s =
                Stream.generate(new NaturalNumbers());
        s.limit(5)
                .peek(System.out::println)
                .forEach(System.out::println);
       /* s.limit(100)
                .map(x -> x * x)
                .forEach(NaturalNumbers::printAdditionCount);
//                .forEach(System.out::println);

        }*/
    }

    private static void printAdditionCount(Integer integer) {
        System.out.print(" | "+ ++count +""+ ((char)178)+"="+ integer);
        if (count % 10 == 0)
            System.out.println();
    }
}