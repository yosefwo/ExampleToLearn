package general;

import java.util.Scanner;

abstract class ExtendsAbstract {
    int width;
    abstract void area();
}
//your code goes here

    class Square extends ExtendsAbstract{
        private int x;

        public Square(int x) {
            this.x = x;
        }

        @Override
        void area() {
            System.out.println(x*x);
        }
    }

    class Circle extends ExtendsAbstract{
        private int x;

        public Circle(int x) {
            this.x = x;
        }

        @Override
        void area() {
            System.out.println(Math.PI*x*x);
        }
    }
class Program {

    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}