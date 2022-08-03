package learnLambdas;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class EffectivelyFinal {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            int divider = scanner.nextInt();
            processNumbers(list, num -> num % divider == 0,
                    System.out::println);
        }
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