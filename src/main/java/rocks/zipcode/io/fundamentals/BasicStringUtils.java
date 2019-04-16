package rocks.zipcode.io.fundamentals;

public class BasicStringUtils {
    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(char[] chars) {
        StringBuilder word = new StringBuilder("");
        for (char letter: chars) {
            word.append(letter);
        }
        return word.toString();
    }

    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(Character[] chars) {
        StringBuilder word = new StringBuilder("");
        for (Character letter: chars) {
            word.append(letter);
        }
        return word.toString();
    }

    /**
     * @param string - string to be manipulated
     * @return identical string with lowercase and uppercase vowels removed
     */
    public static String removeAllVowels(String string) {
        String[] vowelArray = new String[] {"a","e","i","o","u","A","E","I","O","U"};
        for (String letter: vowelArray) {
            string = string.replaceAll(letter,"");
        }
        return string;
    }

    /**
     * @param string             - string to be manipulated
     * @param charactersToRemove - characters to be removed from string
     * @return
     */
    public static String removeSpecifiedCharacters(String string, String charactersToRemove) {
        String[] characters = charactersToRemove.split("");
        for (String letter: characters) {
            string = string.replaceAll(letter.toLowerCase(),"");
            string = string.replaceAll(letter.toUpperCase(),"");
        } return string;
    }
}
