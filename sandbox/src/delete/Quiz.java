package delete;


import java.util.*;
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

    public static int duplicateCount(String text) {
        int count = 0;
        /*char[] toCharArray = text.toLowerCase().toCharArray();
        int ascii = 127;
        for (int i = 0; i < toCharArray.length; i++) {
            boolean haveDublicate = false;
            char index = toCharArray[i];
            for (int j = i+1; j <  toCharArray.length; j++) {
                if (index == toCharArray[j]){
                    haveDublicate = true;
                    toCharArray[j] = (char) ascii++;
                }

            }
            if (haveDublicate)
                count++;
        }*/
        while (text.length() > 0){
            text = text.toLowerCase(Locale.ROOT);
            String firstLetter = text.substring(0,1);
            text = text.substring(1);
            if (text.contains(firstLetter))
                count++;
            text = text.replace(firstLetter,"");
        }
        return count;
    }
    public static double findUniq(double arr[]) {
        /*double first = arr[0];
        if (arr[1] == first){
            for (int i = 2; i < arr.length; i++) {
                if (arr[i] != first)
                    return arr[i];
            }
        }
        return arr[2] == first ? arr[1]: first;*/
        Arrays.sort(arr);
        return arr[0]==arr[1] ? arr[arr.length-1] : arr[0];
    }
    public static boolean scramble(String str1, String str2) {
     /*   while (str2.length() > 0) {
            String firstLetter = str2.substring(0, 1);
            str2 = str2.substring(1);
            if (str1.contains(firstLetter))
                str1 = str1.replaceFirst(firstLetter,"");
            else
                return false;
        }
        return true;*/
        if (str2.length() > str1.length()) return false;
        for (String s : str2.split("")) {
            if (!str1.contains(s)) return false;
            str1 = str1.replaceFirst(s, "");
        }

        return true;
    }
    public static char findMissingLetter(char[] array) {
        int valueAscii = array[0];
        for (int i = 1; i < array.length; i++) {
            if (valueAscii + 1 != array[i] )
                return (char) (valueAscii + 1);
            valueAscii ++;
        }
        return ' ';
    }
    public static boolean check(int[][] sudoku) {
        boolean contain = true;
        for (int row = 0; row < 9;row++){
            Set list1_9 = InitializeSet();
            for (int col = 0; col < 9; col++){
                contain = list1_9.remove(sudoku[row][col]);
                if (!contain)
                    return false;
            }
        }
        for (int col = 0; col < 9;col++){
            Set list1_9 = InitializeSet();
            for (int row = 0; row < 9; row++){
                contain = list1_9.remove(sudoku[col][row]);
                if (!contain)
                    return false;
            }
        }
        int rowSquareStart = 0, colSquareStart = 0;
        int rowSquareLength = 3, colSquareLength = 3;
        int count1 = 0;
        while (colSquareLength <= 9) {
            Set list1_9 = InitializeSet();
            for (int row = rowSquareStart;row < rowSquareLength; row++) {
                for (int col = colSquareStart; col < colSquareLength; col++) {
                    contain = list1_9.remove(sudoku[col][row]);
                    if (!contain)
                        return false;
                }
            }
            if (rowSquareLength < 9){
                rowSquareLength += 3;
                rowSquareStart  += 3;
            } else {
                colSquareLength += 3;
                colSquareStart += 3;
            }
        };
        return contain;
    }
    private static Set InitializeSet() {
        Set <Integer> list1_9 = new HashSet<>(9);
        for (int i = 1; i <= 9; i++) {
            list1_9.add(i);
        }
        return list1_9;
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

        System.out.println(duplicateCount("abbcdea"));
        System.out.println(duplicateCount("indivisibility"));
        System.out.println(duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));

        System.out.println(findUniq(new double[]{1, 0, 1}));
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));

//        System.out.println(scramble("rkqodlw","world"));
//        System.out.println(scramble("cedewaraaossoqqyt","codewars")+"true");
//        System.out.println(scramble("katas","steak")+"false");
//        System.out.println(scramble("scriptjavx","javascript")+"false");
        System.out.println(scramble("scriptingjava","javascript")+"true");
        System.out.println(scramble("scriptsjava","javascripts")+"true");
        System.out.println(scramble("javscripts","javascript")+"false");
        System.out.println(scramble("aabbcamaomsccdd","commas")+"true");
        System.out.println(scramble("commas","commas")+"true");
        System.out.println(scramble("sammoc","commas")+"true");

        System.out.println(findMissingLetter(new char[] { 'a','b','c','d','f' }));
        System.out.println(findMissingLetter(new char[] { 'O','Q','R','S' }));

        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
        System.out.println(check(sudoku));
        sudoku[0][0]++;
        sudoku[1][1]++;
        sudoku[0][1]--;
        sudoku[1][0]--;

        System.out.println(check(sudoku));

        sudoku[0][0]--;
        sudoku[1][1]--;
        sudoku[0][1]++;
        sudoku[1][0]++;

        sudoku[4][4] = 0;

        System.out.println(check(sudoku));
    }
}
