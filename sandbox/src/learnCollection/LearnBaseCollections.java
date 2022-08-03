package learnCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LearnBaseCollections {
    public static void main(String[] args) {
//        Collections  set String
        Set<String> stringSet = new HashSet<>();
        stringSet.add("yosef");
        stringSet.add("zundel");
        stringSet.add("zundel");
        stringSet.add("hacohen");
        stringSet.add("wollman");
        stringSet.remove("yosef");
        for (String s: stringSet) {
            System.out.println(s);
        }
        System.out.println(stringSet.size());
        System.out.println(stringSet.contains("zundel"));
//        Collections  set Integer
        Set<Integer> IntegerSet = new HashSet<>();
        IntegerSet.add(1);
        IntegerSet.add(17);
        IntegerSet.add(21);
        IntegerSet.add(12);
        IntegerSet.add(25);
        IntegerSet.add(1);
        for (Integer I: IntegerSet) {
            System.out.println(I);
        }
        System.out.println(stringSet.size());
        //        Collections  List Integer
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(3);
        for (int j:integerList) {
            System.out.println(j);
        }
        System.out.println(integerList.size());
        System.out.println(integerList.get(4));



    }
}
