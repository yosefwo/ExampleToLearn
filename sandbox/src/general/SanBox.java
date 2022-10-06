package general;

public class SanBox {

    public class StringSplit {
        public static String[] solution(String s) {
            int len = s.length();
            if (len % 2 != 0)
                len = len / 2+1;
            else len /=2;
            String[] arr2char = new String[len];
            int indexArr2char = 0;
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i= i+2) {
                for (int j = 1; i <= 2 ; i++) {
                    arr2char[indexArr2char] += String.valueOf(chars[i]);
                    indexArr2char ++;
                }

            }
            return arr2char;
        }

        public static void main(String[] args) {

            System.out.println();
        }
    }

}
