package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readWithScanner {
    public static void main(String[] args) {
        try {
            File x = new File("C:\\Users\\yosef.wollman\\OneDrive - Qualitest Group\\JAVA\\SandboxLearning\\sandbox\\asset\\New Text Document.txt");
            Scanner sc = new Scanner(x);
            System.out.println(sc.nextInt());
            while(sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
    }
}
