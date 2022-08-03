package delete;
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
        String result = "";
        for (int i = 0; i < toString.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(toString.charAt(i)));
            result += Integer.toString(digit*digit);
        }
        return Integer.parseInt(result);
    }


    public static void main(String[] args) {
        var v = solution("saasfhjkiusdafjkauewo");
        for (String a: v){
            System.out.println(a);
        }
        System.out.println(v);
        int n = squareDigits(91191);

        System.out.println(n);
        System.out.println("sdsd");

    }
}
