package learnCollection;

import java.util.ArrayList;
import java.util.List;

class PairGeneric<T1 ,T2> {
    private T1 leftElement;
    private T2 rightElement;
    public PairGeneric(T1 a, T2 b) {
        leftElement = a;
        rightElement = b;
    }
    public T1 getLeftElement() {
        return leftElement;
    }
    public void setLeftElement(T1 leftElement) {
        this.leftElement = leftElement;
    }
    public T2 getRightElement() {
        return rightElement;
    }
    public void setRightElement(T2 rightElement) {
        this.rightElement = rightElement;
    }

    public static void main(String[] args) {
        PairGeneric<Integer, Integer> pairOfInts = new PairGeneric<Integer, Integer>(3, 5);
        PairGeneric<String, String> pairOfStrings = new PairGeneric<String, String>("left","right");
        PairGeneric<String, Integer> pairOfStringsAndInteger = new PairGeneric<String, Integer>("left",23156);
        System.out.println(pairOfInts.getLeftElement());
        System.out.println(pairOfInts.getRightElement());
        System.out.println(pairOfStrings.getRightElement()+pairOfStrings.getLeftElement());
        System.out.println(pairOfStringsAndInteger.getLeftElement() + pairOfStringsAndInteger.getRightElement());
        List<String> list = new ArrayList<>(){
            @Override
            public int size() {
                return super.size();
            }

            @Override
            public boolean isEmpty() {
                return super.isEmpty();
            }
        };


    }
}