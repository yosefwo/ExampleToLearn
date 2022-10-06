package general;

import java.util.Scanner;
public class FormatString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "word1, word2 word3@word4?word5.word6";
        String split1[] = str.split("[, ?.@]+");
        for (String a:split1) {
            System.out.print(a+" ");
        }
//        for (int j = 0; j < split1.length; j++)
//            System.out.println( "split1["+j+"] =" + split1[j]);


//        String str2 =  "s1s2s3s4s5s6s7s8s9s1s2s3s4s5s6s";
        String str2 =  "s123s456s";
        for (int i = -1;i < 4; i++) {
            String split2[] = str2.split("s" ,i);
            System.out.print("\n"+"str.split(\"s\"," +i+");");
            System.out.print("\t" + "split2.length = "+ split2.length + "\t");
            for (String a:split2) {
                System.out.print(a +"*");
            }
        }

        System.out.println(" ");
        String trim1 = "       trim())        ";
        System.out.print('*');
        System.out.print(trim1);
        System.out.print('*');
        System.out.print(trim1.trim());
        System.out.println('*');

        String charArray1 = "char";
        char charArray2[] = charArray1.toCharArray();
        for (int i = 0; i < charArray2.length; i++){
            System.out.print( "\tcharArray2["+i+"]= " + charArray2[i]);
        }
        String substring1 = "substring";
        System.out.println("substring1.substring(3)= "+ substring1.substring(3));
        String substring2 = "substring";
        System.out.println("substring2.substring(3,8)= "+ substring2.substring(3,8));

        String replace1 = "replace1e replace1e";
        System.out.println(replace1.replace("ce","eee"));

        String replace11 = "replace11e replace11e";
        System.out.println(replace11.replace("ce","eee"));

        String replaceAll1 = "replaceAlle replaceAlle";
        System.out.println(replaceAll1.replaceAll("ce","eee"));

        String indexOf1 = "e1e";
        System.out.println(indexOf1.indexOf("e"));
        System.out.println(indexOf1.indexOf("e",1));

        System.out.println("isEmpty");
        String isEmpty1 = "Hello";
        String isEmpty2 = " ";
        String isEmpty3 = "";
        System.out.println(isEmpty1.isEmpty());
        System.out.println(isEmpty2.isEmpty());
        System.out.println(isEmpty3.isEmpty());

        System.out.println("isBlank");
        String isBlank1 = "Hello";
        String isBlank2 = " ";
        String isBlank3 = "";
        System.out.println(isBlank1.isBlank());
        System.out.println(isBlank2.isBlank());
        System.out.println(isBlank3.isBlank());

        System.out.println("contains");
        String contains1 = "contains1";
        String contains2 = "contains";
        System.out.println(contains1.contains("contains1"));
        System.out.println(contains2.contains("contains1"));


        System.out.println("\\n");
        System.out.print("hello\nworld\n");
        System.out.println("\\r");
        System.out.print("hello\rworld");
        System.out.println();
        System.out.println("\\t");
        System.out.print("hello\tworld\n");
        System.out.println("\\b");
        System.out.print("hello\b\bworld\n");




    }





}

