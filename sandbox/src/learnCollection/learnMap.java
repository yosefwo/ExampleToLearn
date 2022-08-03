package learnCollection;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class learnMap {/*




    private int pixelsFont = 16;
    private String fontName;



    public double brightnessImgChar(boolean[][] cs) {
        int sum = 0;
        for (int row = 0; row < cs.length; row++){
            for (int col = 0; col < cs[row].length; col++){
                if (cs[row][col])
                    sum++;
            }
        }
        int numPixsel = cs.length * cs.length;
        return ((double)sum/numPixsel);
    }

    public Map<Double,Character> brightnessImgArrbrightnessImgArrayCharayChar(Set<Character> charSet) {
        Map<Double,Character> brightnessImgCharToDouble = new HashMap<>();
        for ( char a:charSet) {
            double brightnessChar = brightnessImgChar(CharRenderer.getImg(a, pixelsFont, fontName));
            brightnessImgCharToDouble.put(brightnessChar, a);
        }

        return brightnessImgCharToDouble;
    }

    public static Map<Double,Character> linearStretching(Map<Double,Character> brightnessImgCharToDouble) {
        Map<Double,Character> inearImgCharToDouble = new HashMap<>();
        double = brightnessImgCharToDouble.keySet().iterator().next();


        double min = (double)minO;

        for (double a: brightnessImgCharToDouble.keySet()) {

        }
        double min = brightnessImgCharArrayDouble[0], max = brightnessImgCharArrayDouble[0];
        for (int i = 1; i < brightnessImgCharArrayDouble.length; i++) {
            if (brightnessImgCharArrayDouble[i] < min)
                min = brightnessImgCharArrayDouble[i];
            if (brightnessImgCharArrayDouble[i]  > max)
                max = brightnessImgCharArrayDouble[i];
        }



        for (int i = 0; i < brightnessImgCharArrayDouble.length; i++){
            brightnessImgCharArrayDouble[i] = (brightnessImgCharArrayDouble[i] - min) /
                    (max - min);
        }
        return brightnessImgCharArrayDouble;

    }
    public static double brightnessImag(Image img){
        double sum = 0;

        for (Color pixel : img.pixels()) {
            sum += pixel.getRed() * 0.2126 + pixel.getGreen() * 0.7152 + pixel.getBlue() * 0.0722;
        }
        sum/= 255;
        return (sum/(img.getWidth() * img.getWidth()));
    }
    public char[][]  convertImageToAscii( int pixels, char[] charToImag, double[] linearStretching){
        char[][] asciiArt = new char[img.getHeight()/pixels][img.getWidth()/pixels];
        int row = 0, col = asciiArt.length -1;
        for(Image subImage : img.squareSubImagesOfSize(pixels)) {
            if (!(col >= 0)) {
                row++;
                col = asciiArt.length -1;
            }
            double brightnessImag = BrightnessImgCharMatcher.brightnessImag(subImage);
            int index = 0;
            double CharMatcher = Math.abs(linearStretching[0] - brightnessImag);
            for (int i = 1; i < linearStretching.length; i++) {
                if (Math.abs(linearStretching[i] - brightnessImag) < CharMatcher)
                    index = i;
            }
            asciiArt[row][col] = charToImag[index];
            col--;
        }
        return asciiArt;

    }
    public char[][] chooseChars(int numCharsInRow, char[] charSet) {
        int pixels = img.getWidth() / numCharsInRow;
        double[] brightnessImgCharArrayDouble = new double[charSet.length];
        brightnessImgCharArrayDouble = this.brightnessImgArrbrightnessImgArrayCharayChar(charSet);
        brightnessImgCharArrayDouble = this.linearStretching(brightnessImgCharArrayDouble);
        char[][] asciiArt = new char[img.getHeight() / pixels][img.getWidth() / pixels];

        asciiArt = this.convertImageToAscii(pixels, charSet, brightnessImgCharArrayDouble);
        return asciiArt;
    }
*/}

