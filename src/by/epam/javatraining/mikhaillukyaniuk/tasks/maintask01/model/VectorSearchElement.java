/**
 * Created by Mikhail Lukyaniuk 19.03.2019. EPAM java course Main Task 01
 * Sorting and Searching Algorithms. Work with vector Model part
 */
package by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model;

import static by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model.
        VectorSort.makeBubbleAscendingsort;

public class VectorSearchElement {
    //Finding if the selected element exist in array. Binary search
	public static int makeBinarSearch (double key, double array[]) {
		int high = array.length - 1;
		int low = 0;
		int index = -1;
		makeBubbleAscendingsort(array);
		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] < key) {
				low = mid + 1;
			} else if (array[mid] > key) {
				high = mid - 1;
			} else if (array[mid] == key) {
				index = mid;
				break;
			}
		}
		return index;
	}
	
	//Finding if the selected element exist in array. Lineary search
	public static int makeLinerSearch (double key, double array[]) {
		makeBubbleAscendingsort(array);
		for (int i = 0; i < array.length; i++) {
			if (key == array[i]) {
				return i;
			}
		}
		return -1;
	}
}
