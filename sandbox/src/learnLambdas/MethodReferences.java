package learnLambdas;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferences {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
        processNumbers(list, MethodReferences::isPrime,
                System.out::print);
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
    private static boolean isPrime(int num){
        int sqrt = (int)Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0)
                return  false;
        }
        return  num > 1;
    }
}
