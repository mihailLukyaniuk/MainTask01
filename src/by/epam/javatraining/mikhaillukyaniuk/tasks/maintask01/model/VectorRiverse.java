/**
 * Created by Mikhail Lukyaniuk 19.03.2019. EPAM java course Main Task 01
 * Sorting and Searching Algorithms. Work with vector Model part
 */
package by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model;

public class VectorRiverse {
    //Riversing the array
	public static double[] makeRiverse (double array[]) {
		for (int i = 0; i < array.length / 2; i++) {
			double j = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = j;
		}
		return array;
	}
}
