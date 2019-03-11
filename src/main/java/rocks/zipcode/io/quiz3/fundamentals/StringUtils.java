package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder stringBuilder = new StringBuilder(str);

        return stringBuilder.replace(indexToCapitalize, indexToCapitalize+1, str.toUpperCase().charAt(indexToCapitalize)+"").toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return (baseString.charAt(indexOfString) == characterToCheckFor);
    }

    public static String[] getAllSubStrings(String string) {
        String[] subStrings = new String[getNumberOfSubStrings(string)];
        Integer subStringArrayIndex = 0;

        for (int i = 0; i < string.length()-1; i++) {
            for (int j = i+1; j <= string.length(); j++) {
                subStrings[subStringArrayIndex] = string.substring(i, j);
                subStringArrayIndex++;
            }
        }

        return subStrings;
    }

    public static Integer getNumberOfSubStrings(String input){
        Integer numberOfSubstrings = 0;

        for (int i = 0; i < input.length()-1; i++) {
            numberOfSubstrings = getSubstringsForCharacter(input, numberOfSubstrings, i);
        }
        return numberOfSubstrings;
    }

    private static Integer getSubstringsForCharacter(String input, Integer numberOfSubstrings, int i) {
        for (int j = i+1; j <= input.length(); j++) {
            numberOfSubstrings++;
        }
        return numberOfSubstrings;
    }
}
