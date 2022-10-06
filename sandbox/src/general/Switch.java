package general;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
//        example 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select an action: + , - , *  or / ");
        char oprator = scanner.nextLine().charAt(0);
        System.out.print("enter number first: ");
        double number_first = scanner.nextInt();
        System.out.print("enter number secend: ");
        double number_secend = scanner.nextInt();
        double result;
        switch (oprator) {
            case '+':
                result = number_first + number_secend;
                System.out.println( number_first + "+" + number_secend + " = " + result);
                break;
            case '-':
                result = number_first - number_secend;
                System.out.println(number_first + "-" + number_secend + " = " + result);
                break;
            case '*':
                result = number_first * number_secend;
                System.out.println(number_first + "*" + number_secend + " = " + result);
                break;
            case '/':
                result = number_first / number_secend;
                System.out.println(number_first + "/" + number_secend + " = " + result);
                break;
            default:
                System.out.println("There's a mistake. We'll start over and please press action: + , - , *  , /  or \"a\" to finish");
        }
        String operator_With_String_WithoutEqals = "" + oprator;
        //        example 2
        switch (operator_With_String_WithoutEqals) {
            case "+"->
                System.out.println( number_first + "+" + number_secend + " = " + (number_first + number_secend));
            case "-"->
                System.out.println(number_first + "-" + number_secend + " = " + (number_first - number_secend));
            case "*"->
                System.out.println(number_first + "*" + number_secend + " = " + (number_first * number_secend));
            case "/"->
                System.out.println(number_first + "/" + number_secend + " = " + (number_first / number_secend));
            default->
                System.out.println("There's a mistake. We'll start over and please press action: + , - , *  , /  or \"a\" to finish");
        }

        //        example 2
        String solution  = switch(oprator) {
            case '+' -> number_first + "+" + number_secend +"=" + (number_first + number_secend);
            case '-' -> number_first + "-" + number_secend +"=" + (number_first - number_secend);
            case '*' -> number_first + "*" + number_secend +"=" + (number_first * number_secend);
            case '/' -> number_first + "/" + number_secend +"=" + (number_first / number_secend);
            default -> "Invalid operator";
        };
        System.out.println("example 2= " + solution);
//        example 3
        double doubleSolution  = switch(oprator) {
            case '+' -> number_first + number_secend;
            case '-' -> number_first - number_secend;
            case '*' -> number_first * number_secend;
            case '/' -> number_first / number_secend;
            default -> 0;
        };
        System.out.println("example 3= " +number_first + oprator + number_secend +"="+ doubleSolution);
        //example 4 with case to contain multi value
        int day = 2;
        String dayType  = switch(day) {
            case 1, 2, 3, 4, 5 -> "Working day";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };
        System.out.println(dayType);

        System.out.println(returneWithJava13("Tuesday"));
    }
    //example 5 return with word "yield"

    private static String returneWithJava13(String day) {
        return  switch (day) {
            case "Monday":
                yield  "Weekday";
            case "Tuesday":
                yield "Weekday";
            case "Wednesday":
                yield "Weekday";
            case "Thursday":
                yield "Weekday";
            case "Friday":
                yield "Weekday";
            case "Saturday":
                yield "Weekend";
            case "Sunday":
                yield "Weekend";
            default:
                yield "Unknown";
        };
    }
}
