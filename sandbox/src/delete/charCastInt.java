package delete;

import java.util.Scanner;

public class charCastInt {
    public static void main(String[] args) {
        System.out.println((int)'א');
        System.out.println((int)'ת');
        for (int i = 0; i < 1000000000; i++) {
            System.out.print((char)i);
            if (i%1000000 == 0)
                System.out.print("\n"+i+"\n");
        }
    }
}
