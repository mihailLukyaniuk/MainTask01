/**
 * Created by Mikhail Lukyaniuk 19.03.2019.
 * EPAM java course Main Task 01
 * Sorting and Searching Algorithms. Work with vector
 * Model part
 */
package by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model;

import java.util.Arrays;

public class VectorCount {
	
	public static double findMin (double array[]) {
		double min = array[0];
        for(int i = 1; i <= array.length-1; i++) {
        	if (array[i] < min) {
        		min = array[i];
        	}
        }
        return min;
	}
	
	public static double findMax(double array[]) {
		double max = array[0];
        for(int i = 1; i <= array.length-1; i++) {
        	if (array[i] > max) {
        		max = array[i];
        	}
        }
        return max;
	}
	
	public static double findMiddleArifm(double array[]) {
		double sum = 0;
        for(int i = 0; i <= array.length-1; i++) {
        	sum += array[i];
        }
        double average = sum / array.length;
        return average;
	}
	
	public static double findMiddleGeometr(double array[]) {
		double mult = 1;
        for(int i = 0; i <= array.length-1; i++) {
        	mult = mult * array[i];
        }
        double averageGeom = Math.exp(Math.log(mult)/array.length);
        return averageGeom;
        }
	
	public static boolean checksort(double array[]) {
		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] > array[i]) {
				return false;
			}
		}
		return true;
	}
	
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
	
	public static int LinerSearch (double key, double array[]) {
		bubbleAscendingsort(array);
		for (int i = 0; i < array.length; i++) {
			if (key == array[i]) {
				return i;
			}
		}
		return -1;
	}
	

	public static double[] riverse (double array[]) {
		for (int i = 0; i < array.length / 2; i++) {
			double j = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = j;
		}
		return array;
	}

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
	
	public static double[] selectionAscendingsort (double array[]) {
		for (int i = 0; i < array.length - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < array.length; j++)
				if (array[j] < array[min_idx])
					min_idx = j;
			double temp = array[min_idx];
			array[min_idx] = array[i];
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
