/**
 * Created by Mikhail Lukyaniuk 19.03.2019. EPAM java course Main Task 01
 * Sorting and Searching Algorithms. Work with vector Model part
 */
package by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model;

public class VectorMiddleCount {

//	//Finding average arithmetic value
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
	
	
}
