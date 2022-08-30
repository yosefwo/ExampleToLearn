package learnLambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortColctionWithCompertorLambda {
    public static void main(String[] args) {
        List<String> beatles = Arrays.asList("John",
                "Paul", "George", "Ringo");
       /* Collections.sort(beatles, new Comparator<String>() {
                    @Override
                    public int compare(String a, String b) {
                        return Integer.compare(a.length(), b.length());
                    }
                }
        );*/
        Comparator<String> cmp = (String x, String y)-> {
            return Integer.compare(x.length(), y.length());
        };
        Collections.sort(beatles, cmp);

        System.out.println(beatles);

    }
}