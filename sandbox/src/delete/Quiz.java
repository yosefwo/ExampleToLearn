package delete;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz {

    public static String[] solution(String s) {
        s += s.length() % 2 != 0 ? "_" : "";
        String[] splitedString = new String[s.length()/2];
        for (int i = 0 , iOFs = 0;i < splitedString.length; i++,iOFs +=2) {
            splitedString[i] = (s.substring(iOFs, iOFs+2));
        }
        return splitedString;
    }
    public static int squareDigits(int n) {
        String toString = Integer.toString(n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < toString.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(toString.charAt(i)));
            result.append(digit * digit);
        }
        return Integer.parseInt(result.toString());
    }

    public static String accum(String s) {
        String upper = s.toUpperCase();
        s = s.toLowerCase();
        StringBuilder result = new StringBuilder("" + upper.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            result.append("-").append(upper.charAt(i));
            result.append(String.valueOf(s.charAt(i)).repeat(i));// במקום לולאת פור אני עושה ריפיט עד מתי
        }
        return result.toString();
    }

    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(e -> e instanceof Integer).collect(Collectors.toList());

        /*List<Object> listResult = new ArrayList<>();
         list.forEach(s-> {
            if (s instanceof Integer)
                listResult.add(s);
        });
         return listResult;*/
    }


    public static boolean isSquare(int n) {
        return Math.sqrt(n) % 1 == 0;
//        return Math.sqrt(n) == (int)Math.sqrt(n);
    }
    public static int GetSum(int a, int b) {
        int res = 0;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            res += i;
        }
        return a == b ? a : res;
    }

    public static String pigIt(String str) {
        String[] splitArr = str.split(" ");
        for (int i = 0; i < splitArr.length; i++) {
            if (splitArr[i].length() < 2)
                continue;
            char ch = splitArr[i].charAt(0);
            splitArr[i] = splitArr[i].substring(1) + ch + "ay";
            if (i < splitArr.length -1)
                splitArr[i] = splitArr[i].substring(1) + " ";

        }
       /* for (String s: splitArr) {
            var ch = s.charAt(0);
            s = s.substring(1) + ch + "ay";
        }*/
        return Arrays.stream(splitArr).collect(Collectors.joining());
    }

    public static String camelCase(String str) {
        /*String[] splitArr = str.split(" ");
        for (int i = 0; i < splitArr.length; i++) {
            if (splitArr[i].length() < 1)
                continue;
            char ch = Character.toUpperCase(splitArr[i].charAt(0));
            splitArr[i] = ch + splitArr[i].substring(1);
        }
        return Arrays.stream(splitArr).collect(Collectors.joining());*/
        return (str == null || str.isEmpty())?"":Arrays.stream(str.trim().split(" "))
                .map(s -> s.substring(0,1).toUpperCase()+s.substring(1))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        var v = solution("saasfhjkiusdafjkauewo");
        for (String a: v){
            System.out.println(a);
        }
        int n = squareDigits(91191);

        System.out.println(n);
        System.out.println("sdsd");
        System.out.println(accum("RqaEzty"));
        System.out.println(
        accum("ZpglnRxqenU") + "\n" +
        accum("NyffsGeyylB")  + "\n" +
        accum("MjtkuBovqrU") + "\n" +
        accum("EvidjUnokmM") + "\n" +
        accum("HbideVbxncC"));
        System.out.println(filterList(List.of(1, 2, "aasf", "1", "123", 123)));
        System.out.println(isSquare(5));
        System.out.println(GetSum(1,0));
        System.out.println(GetSum(1,2));
        System.out.println(GetSum(0,1));
        System.out.println(GetSum(1,1));
        System.out.println(GetSum(-1,0));
        System.out.println(GetSum(-1,2));
        System.out.println(pigIt("Pig latin is cool")); // igPay atinlay siay oolcay
        System.out.println(pigIt("Hello world !"));

        System.out.println(camelCase("hello case")); // => "HelloCase"
        System.out.println(camelCase("camel case word")); // => "CamelCaseWord"


    }
}
