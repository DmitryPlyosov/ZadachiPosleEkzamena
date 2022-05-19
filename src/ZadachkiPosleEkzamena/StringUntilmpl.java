package ZadachkiPosleEkzamena;

import java.util.Locale;

public class StringUntilmpl implements StringUtil {


    @Override
    public String getRevertedSubstring(String text, int startIndex, int endIndex) {
        String text2 = text.substring(startIndex,endIndex);
        return new StringBuilder(text2).reverse().toString();
    }

    @Override
    public int countChar(String text, char character) {
       text = text.toLowerCase(Locale.ROOT);
       int count = 0;
       char[] array = text.toCharArray();
       for( char buk: array){
           if (buk == character){
               count++;
           }
       }
       return count;
    }
}
