package files;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Formatter;

public class writeWithFormatter {
    public static void main(String[ ] args) throws FileNotFoundException {
        createFile();
        writerFile();
        readFile();
    }

    private static void createFile() {
        //פעולה זו יוצרת קובץ ריק בנתיב שצוין. אם הקובץ כבר קיים, פעולה זו תחליף אותו.
        try {
            Formatter f = new Formatter("C:\\Users\\yosef.wollman\\OneDrive - Qualitest Group\\JAVA\\ExampleToLearn\\sandbox\\asset\\test.txt");
        } catch (Exception e) {
            System.out.println("Error create");
        }
    }

    private static void writerFile() {
        try {
            Formatter f = new Formatter("C:\\Users\\yosef.wollman\\OneDrive - Qualitest Group\\JAVA\\ExampleToLearn\\sandbox\\asset\\test.txt");
            f.format("%s %s %s", "1","John", "Smith \r\n");
            f.format("%s %s %s", "1","John", "Smith \r\n");
            f.format("%s %s %s", "1","John", "Smith \r\n");
            f.format("%s %s %s", "2","Amy", "Brown");
            f.close();
        } catch (Exception e) {
            System.out.println("Error writer");
        }
    }

    private static void readFile() throws FileNotFoundException {
        File x = new File("C:\\Users\\yosef.wollman\\OneDrive - Qualitest Group\\JAVA\\ExampleToLearn\\sandbox\\asset\\test.txt");
        Scanner sc = new Scanner(x);
        while(sc.hasNext()) {
            System.out.println(sc.next());//מוצא ומחזיר את האסימון המלא הבא מסורק זה. לפני אסימון שלם ואחריו קלט התואם לתבנית המפריד. שיטה זו עשויה לחסום בזמן ההמתנה לקלט לסריקה, גם אם הפעלה קודמת של hasNext החזירה true.
        }
        sc.close();
    }
}
