package learnCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LearnIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        list.forEach(System.out::print);

        System.out.println(11111111);
        Iterator<Integer> it = list.iterator();
//        while (it.hasNext()) {
//            Integer i = it.next();
//            if (i > 6)
//                it.remove();
//        }
//                       לא הבנתי עדיין 
        it.forEachRemaining(System.out::print);
        for (Iterator<Integer> iter = it; iter.hasNext(); ) {
            Integer i = iter.next();
            System.out.println(i);

        }
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
    }
}
