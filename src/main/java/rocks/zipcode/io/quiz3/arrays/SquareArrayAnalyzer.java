package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {
        List<Integer> squared = Arrays.asList(squaredValues);

        for (Integer i: input) {
            if(!squared.contains(i*i)){
                return false;
            }
        }
        return true;
    }
}
