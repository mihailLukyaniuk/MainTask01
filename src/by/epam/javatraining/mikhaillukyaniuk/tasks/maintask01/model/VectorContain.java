/**
 * Created by Mikhail Lukyaniuk 19.03.2019. EPAM java course Main Task 01
 * Sorting and Searching Algorithms. Work with vector Model part
 */
package by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model;

import java.util.Arrays;
import java.util.stream.Stream;

public class VectorContain {
    
    private static int NUMBER_OF_ELEMENTS_IN_ARRAY = 10;

    public double[] createDouble() {
        double[] exampleArray = new double[NUMBER_OF_ELEMENTS_IN_ARRAY];
        for (int i = 0; i < exampleArray.length; i++) {
            exampleArray[i] = (int) ((Math.random() * 100));
        }
        return exampleArray;
    }
}