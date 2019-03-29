/**
 * Created by Mikhail Lukyaniuk 19.03.2019. EPAM java course Main Task 01
 * Sorting and Searching Algorithms. Work with vector Model part
 */
package by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model;

public class VectorExtrems {

    //Finding min value of array
    public static double findMin(double array[]) {
        double min = array[0];
        for (int i = 1; i <= array.length - 1; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
//	Finding max value of array

    public static double findMax(double array[]) {
        double max = array[0];
        for (int i = 1; i <= array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    //Finding local minimum
    public static double findLocalMin(double array[]) {
        int i = 0;
        for (; i < array.length; i++) {
            if (array[i] < (i > 0 ? array[i - 1] : Integer.MAX_VALUE)
                    && array[i] < (i < array.length - 1 ? array[i + 1]
                    : Integer.MAX_VALUE)) {
                break;
            }
        }
        return i;
    }
}
