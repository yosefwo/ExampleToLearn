package learnLambdas;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambdas {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
        processNumbers(list, num -> num % 2 == 0,
                num -> System.out.print(num + " "));
    }

    private static void processNumbers(
            Iterable<Integer> numbers,
            Predicate<Integer> predicate,
            Consumer<Integer> consumer) {

        for(int num : numbers) {
            if(predicate.test(num)) {
                consumer.accept(num);
            }
        }
    }
}