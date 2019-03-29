/**
 * Created by Mikhail Lukyaniuk 19.03.2019. EPAM java course Main Task 01
 * Sorting and Searching Algorithms. Work with vector Model part
 */
package by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model;

public class VectorSort {
    //Sorts array. Bubble sort
	public static double[] makeBubbleAscendingsort (double array[]) {
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					double temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
	
	//Sorts array. Insertion sort
	public static double[] makeInsertionDescendingsort (double array[]) {
		for (int i = 1; i < array.length; ++i) {
			double key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] < key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
		return array;
		}
	
	//Sorts array. Selection sort
	public static double[] makeSelectionAscendingsort (double array[]) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++)
				if (array[j] < array[min])
					min = j;
			double temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
		return array;
	}
}
