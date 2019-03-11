package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for (SomeType s: this.array){
            if(!((getNumberOfOccurrences(s)%2) == 0)){
                return s;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for (SomeType s: this.array){
            if((getNumberOfOccurrences(s)%2) == 0){
                return s;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        return Collections.frequency(Arrays.asList(this.array), valueToEvaluate);
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List<SomeType> results = Arrays.asList(array);
        results.removeIf(value -> !predicate.apply(value));
        SomeType[] res;

        return null;
    }
}
