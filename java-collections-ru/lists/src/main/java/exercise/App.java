package exercise;
import org.apache.commons.lang3.ArrayUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String symbols, String word) {
        boolean result = false;
        Character[] arrSymbols = ArrayUtils.toObject(symbols.toCharArray());
        Character[] arrWord = ArrayUtils.toObject(word.toCharArray());

        List <Character> listSymbols = new ArrayList<>();
        Collections.addAll(listSymbols, arrSymbols);
        List <Character> listWord = new ArrayList<>();
        Collections.addAll(listWord, arrWord);

        for (var element : listSymbols) {
            result = listWord.contains(element);
        }
        return result;
    }
}
//END
