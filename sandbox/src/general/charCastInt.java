package general;

public class charCastInt {
    public static void main(String[] args) {
        System.out.println((int)'א');
        System.out.println((int)'ת');
        for (int i = 0; i < 1000000000; i++) {
            System.out.print((char)i);
            if (i%1000000 == 0)
                System.out.print("\n"+i+"\n");


        /*    System.out.println((int)'A');
            System.out.println((int)'Z');
            for (int i = 65; i < 91; i++) {
//            System.out.print((char)i);
                System.out.println("rezult.value = rezult.value.replace(/"+((char)i)+"/g, \" " + ((char)i)+ "\");");
//            if (i%1000000 == 0)
//                System.out.print("\n"+i+"\n");*/

               /* System.out.println((int)'A');
                System.out.println((int)'Z');
                String heb = ";/'קראטוןםפשדגכעיחלךף,\\זסבהנמצתץ.";
                String en = "`qwertyuiopasdfghjkl;'\\zxcvbnm,./";
                for (int i = 0; i < 33; i++) {
//            System.out.print((char)i);
                    System.out.println("rezult.value = rezult.value.replace(/"+ heb.charAt(i) +"/g, \"" + en.charAt(i)+ "\");");
//            if (i%1000000 == 0)
//                System.out.print("\n"+i+"\n");*/
        }
    }
}
