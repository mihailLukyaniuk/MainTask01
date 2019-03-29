/**
 * Created by Mikhail Lukyaniuk 19.03.2019. EPAM java course Main Task 01
 * Sorting and Searching Algorithms. Work with vector Control part
 */
package by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.control;

import by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model.
        VectorCheck;
import by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model.
        VectorContain;
import by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model.
        VectorExtrems;
import by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model.
        VectorInitialize;
import by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model.
        VectorMiddleCount;
import by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model.
        VectorRiverse;
import by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model.
        VectorSearchElement;
import by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model.VectorSort;
import by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.view.ViewInfo;
import java.util.Arrays;

public class Screenplay {
    private static double KEY_ELEMENT_TO_FIND = 15;
    
    public static void main(String[] args) {
        
        VectorContain TestArray = new VectorContain();
        double [] array = TestArray.createDouble();
        VectorInitialize vectorInitialize = new VectorInitialize(array);
        
        ViewInfo.printResult(Arrays.toString(vectorInitialize.getArray()), 
                "Input array is: ");
        
        ViewInfo.printResult(String.valueOf(VectorExtrems.findMin(
                vectorInitialize.getArray())), "1)Min value of vector is :");
        ViewInfo.printResult(String.valueOf(VectorExtrems.findMax(
                vectorInitialize.getArray())), "2) Max value is: ");
        ViewInfo.printResult(String.valueOf(VectorMiddleCount.findMiddleArifm(
                vectorInitialize.getArray())), 
                "3) Average arithmetic value is: ");
        ViewInfo.printResult(String.valueOf(VectorMiddleCount.findMiddleGeometr(
                vectorInitialize.getArray())), 
                "4) Average geometrical value is: ");
        ViewInfo.printResult(String.valueOf(VectorCheck.checkSort(
                vectorInitialize.getArray())), "5) Is the array sorted? : ");
        ViewInfo.printResult(String.valueOf(VectorExtrems.findLocalMin(
                vectorInitialize.getArray())), "6) The local min is: ");
        ViewInfo.printResult(String.valueOf(VectorSearchElement.makeBinarSearch(
                KEY_ELEMENT_TO_FIND, (vectorInitialize.getArray()))), 
                "7)Binary search. "
                + "Index of found element is ");
        ViewInfo.printResult(String.valueOf((VectorSearchElement.makeLinerSearch(
                KEY_ELEMENT_TO_FIND, vectorInitialize.getArray()))),
                "8)Linear search. "
                + "Index of found element is ");
        ViewInfo.printResult(Arrays.toString(VectorRiverse.makeRiverse(
                vectorInitialize.getArray())), "9) The riverse vector is: ");
        ViewInfo.printResult(Arrays.toString(VectorSort.makeBubbleAscendingsort(
                vectorInitialize.getArray())), 
                "10) The bubble sorted vector is: ");
        ViewInfo.printResult(Arrays.toString(
                VectorSort.makeInsertionDescendingsort(
                vectorInitialize.getArray())), 
                "11) The insertion sorted vector is: : ");
        ViewInfo.printResult(Arrays.toString(
                VectorSort.makeSelectionAscendingsort(
                vectorInitialize.getArray())), 
                "12) Theselection sorted vector is: ");
    }  
}
