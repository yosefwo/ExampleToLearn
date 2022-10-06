package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadWithBuffer {
    private static Scanner scanner = new Scanner(System.in);
    private static int choice = 0;
    private static FileReader fileReader;

    public static void main(String[] args) throws Exception {
        try {
            fileReader = new FileReader("asset/app-menu.txt");
        } catch (Exception e) {
            throw new Exception("file not find");
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        readChoice(line);
        while (line != null){
            System.out.println(line);
            line = bufferedReader.readLine();
        }

    }

    private static void readChoice(String line) {
        if (line.endsWith(":1"))
            choice = 1;
        else if (line.contains("2"))
            choice = 2;
        else if (line.contains("3"))
            choice = 3;
        else {

            System.out.println("I couldn't find a selection number in the file \"app-menu.txt\"");
        }
    }

    private static void inputNumber() {
        System.out.println("plese enter number");
        String stringNumber = scanner.nextLine();
        choice = 0;
        try {
            choice = Integer.parseInt(stringNumber);
        } catch (Exception e){
            inputNumber();
        }
    }

}
