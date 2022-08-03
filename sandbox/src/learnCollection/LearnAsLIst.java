package learnCollection;

import java.util.Arrays;
import java.util.List;

public class LearnAsLIst {
    public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        for (int i:list) {
            System.out.println(i);
        }
    }
}
