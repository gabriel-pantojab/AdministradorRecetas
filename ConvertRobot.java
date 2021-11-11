 

import java.text.Normalizer;

public class ConvertRobot {
    public static String standardize(String text) {
        text = Normalizer.normalize(text, Normalizer.Form.NFD);
        text = text.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return text.toLowerCase();
    }
    
    public static String[] standardizeArray(String[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = standardize(array[i]);
        }
        return array;
    }
}


