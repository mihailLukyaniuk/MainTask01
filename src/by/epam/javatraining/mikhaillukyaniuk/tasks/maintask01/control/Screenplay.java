/**
 * Created by Mikhail Lukyaniuk 19.03.2019. EPAM java course Main Task 01
 * Sorting and Searching Algorithms. Work with vector Control part
 */
package by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.control;

import by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model.
        VectorInitialize;
import by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model.VectorCount;
import by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model.VectorExample;
import by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.view.ViewInfo;

;

public class Screenplay {
    private static int NUMBER_OF_ELEMENTS_IN_ARRAY = 45;
    private static double KEY_ELEMENT_TO_FIND = 56;
    
    public void play() {
        VectorExample TestArray = 
                new VectorExample(NUMBER_OF_ELEMENTS_IN_ARRAY);
        VectorInitialize vectorInitialize = 
                new VectorInitialize(TestArray.create());
        ViewInfo.arrayPrint(vectorInitialize.getArray(), "Input array is: ");

        ViewInfo.printResult(String.valueOf(VectorCount.findMin(
                vectorInitialize.getArray())), "1)Min value of vector is :");
        ViewInfo.printResult(String.valueOf(VectorCount.findMax(
                vectorInitialize.getArray())), "2) Max value is: ");
        ViewInfo.printResult(String.valueOf(VectorCount.findMiddleArifm(
                vectorInitialize.getArray())), 
                "3) Average arithmetic value is: ");
        ViewInfo.printResult(String.valueOf(VectorCount.findMiddleGeometr(
                vectorInitialize.getArray())), 
                "4) Average geometrical value is: ");
        ViewInfo.printResult(String.valueOf(VectorCount.checksort(
                vectorInitialize.getArray())), "5) Is the array sorted? : ");
        ViewInfo.printResult(String.valueOf(VectorCount.findLocalMin(
                vectorInitialize.getArray())), "6) The local min is: ");
        ViewInfo.printResult(String.valueOf(VectorCount.BinarSearch(
                KEY_ELEMENT_TO_FIND, (vectorInitialize.getArray()))), 
                "7)Binary search. "
                + "Index of found element is ");
        ViewInfo.printResult(String.valueOf(VectorCount.LinerSearch(
                KEY_ELEMENT_TO_FIND, vectorInitialize.getArray())),
                "8)Linear search. "
                + "Index of found element is ");
        ViewInfo.arrayPrint(VectorCount.riverse(
                vectorInitialize.getArray()), "9) The riverse vector is: ");
        ViewInfo.arrayPrint(VectorCount.bubbleAscendingsort(
                vectorInitialize.getArray()), 
                "10) The bubble sorted vector is: ");
        ViewInfo.arrayPrint(VectorCount.insertionDescendingsort(
                vectorInitialize.getArray()),
                "11) The insertion sorted vector is: : ");
        ViewInfo.arrayPrint(VectorCount.selectionAscendingsort(
                vectorInitialize.getArray()), 
                "12) Theselection sorted vector is: ");
    }

    public static void main(String[] args) {
        Screenplay begin = new Screenplay();
        begin.play();
    }
}
