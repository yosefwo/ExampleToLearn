package learnCollection;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < 5; i++)
            s.push(i);
        for (int i = 0; i < 5; i++)
            System.out.print(s.pop() + "\t");
        System.out.println(s.empty());
        for (int i = 0; i < 5; i++)
            s.push(i);
        System.out.println(s.peek());
        System.out.println(s.search(2));

    }
}
