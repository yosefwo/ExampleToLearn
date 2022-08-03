package learnLambdas;

import java.util.List;

/* These interfaces allow us to declare "processNumbers" in a generic form */
interface IntPredicate {
    boolean acceptNumber(int num);
}

interface IntConsumer {
    void consume(int num);
}

/* These are specific implementations in order to filter and consume in a specific manner */
class IsEvenIntPredicate implements IntPredicate {
    @Override
    public boolean acceptNumber(int num) {
        return num % 2 == 0;
    }
}

class PrinterIntConsumer implements IntConsumer {
    @Override
    public void consume(int num) {
        System.out.print(num + " ");
    }
}

public class WithoutLambdas {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
        processNumbers(list, new IsEvenIntPredicate(),
                new PrinterIntConsumer());
    }

    private static void processNumbers(
            Iterable<Integer> numbers,
            IntPredicate predicate,
            IntConsumer consumer) {

        for(int num : numbers) {
            if(predicate.acceptNumber(num)) {
                consumer.consume(num);
            }
        }
    }
}
