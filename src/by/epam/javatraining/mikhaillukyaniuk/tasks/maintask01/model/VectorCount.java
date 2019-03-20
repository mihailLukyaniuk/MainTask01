/**
 * Created by Mikhail Lukyaniuk 19.03.2019.
 * EPAM java course Main Task 01
 * Sorting and Searching Algorithms. Work with vector
 * Model part
 */
package by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model;

public class VectorCount {
	//Finding min value of array
	public static double findMin (double array[]) {
		double min = array[0];
        for(int i = 1; i <= array.length-1; i++) {
        	if (array[i] < min) {
        		min = array[i];
        	}
        }
        return min;
	}
	//Finding max value of array
	public static double findMax(double array[]) {
		double max = array[0];
        for(int i = 1; i <= array.length-1; i++) {
        	if (array[i] > max) {
        		max = array[i];
        	}
        }
        return max;
	}
	//Finding average arithmetic value
	public static double findMiddleArifm(double array[]) {
		double sum = 0;
        for(int i = 0; i <= array.length-1; i++) {
        	sum += array[i];
        }
        double average = sum / array.length;
        return average;
	}
	//Finding average geometrical value
	public static double findMiddleGeometr(double array[]) {
		double mult = 1;
        for(int i = 0; i <= array.length-1; i++) {
        	mult = mult * array[i];
        }
        double averageGeom = Math.exp(Math.log(mult)/array.length);
        return averageGeom;
        }
	//ckecksort checking if the array is sorted
	public static boolean checksort(double array[]) {
		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] > array[i]) {
				return false;
			}
		}
		return true;
	}
	//Finding local minimum
	public static double findLocalMin (double array[]) {
		int i = 0;
		for (; i < array.length; i++) {
			if (array[i] < (i > 0 ? array[i - 1] : Integer.MAX_VALUE)
					&& array[i] < (i < array.length - 1 ? array[i + 1] : Integer.MAX_VALUE)) {
				break;
			}
		}
		return i;
	}
	//Finding if the selected element exist in array. Binary search
	public static int BinarSearch (double key, double array[]) {
		int high = array.length - 1;
		int low = 0;
		int index = -1;
		bubbleAscendingsort(array);
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
	public static int LinerSearch (double key, double array[]) {
		bubbleAscendingsort(array);
		for (int i = 0; i < array.length; i++) {
			if (key == array[i]) {
				return i;
			}
		}
		return -1;
	}
	
	//Riversing the array
	public static double[] riverse (double array[]) {
		for (int i = 0; i < array.length / 2; i++) {
			double j = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = j;
		}
		return array;
	}
	//Sorts array. Bubble sort
	public static double[] bubbleAscendingsort (double array[]) {
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
	public static double[] insertionDescendingsort (double array[]) {
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
	public static double[] selectionAscendingsort (double array[]) {
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

//	public static void mergesort () {
//		
//	}
//	public static void quicksort () {
//	}
	
}
