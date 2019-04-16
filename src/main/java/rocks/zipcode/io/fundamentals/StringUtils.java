package rocks.zipcode.io.fundamentals;


import java.util.ArrayList;
import java.util.Collection;

/**
 * @author leon on 10/01/2019.
 */
public class StringUtils {
    /**
     * @param string - string to be evaluated
     * @return collection containing all permutations of casing of this string
     */
    public static Collection<String> getAllCasings(String string) {
        Collection<String> collection = new ArrayList<>();
        // get length of string
        int length = string.length();
        // get range of length

        // get power-set of range

        // for every set in power-set
            // uppercase indices of string using set
        return collection;
    }

    /**
     * @param string  - string to be evaluated
     * @param indices - indices to be evaluated
     * @return near-identical string whose characters at specified indices are capitalized
     */
    public static String upperCaseIndices(String string, Integer... indices) {
        StringBuilder word = new StringBuilder(string);
        for (Integer index: indices) {
            word.setCharAt(index,Character.toUpperCase(word.charAt(index)));
        }
        return word.toString();
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param valueToBeInserted     - value to insert into string
     * @param index                 - string-index at which to insert value into string
     * @return near-identical string with `valueToBeInserted` inserted at `index`
     */
    public static String insertAtIndex(String stringToBeManipulated, String valueToBeInserted, Integer index) {
        String newWord = stringToBeManipulated.substring(0,index) + valueToBeInserted + stringToBeManipulated.substring(index);
        return newWord;
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param replacementValue      - value to insert at `index`
     * @param index                 - position of string to be manipulated
     * @return near-identical string with character at `index` replaced with `replacementValue`
     */
    public static String replaceAtIndex(String stringToBeManipulated, Character replacementValue, Integer index) {
        StringBuilder word = new StringBuilder(stringToBeManipulated);
        word.setCharAt(index,replacementValue);
        return word.toString();
    }
}
