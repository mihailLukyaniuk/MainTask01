/**
 * Created by Mikhail Lukyaniuk 19.03.2019.
 * EPAM java course Main Task 01
 * Sorting and Searching Algorithms. Work with vector
 * View part
 */
package by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.view;

public class ViewInfo {
	
	public static void printResult(String result, String text) {
		System.out.printf("%n" + text + result + "%n");
	}
	public static void arrayPrint(double arr[], String text) {
	    System.out.println(text);
	    for (int i = 0; i < arr.length; i++) {
	        System.out.printf("%n" + arr[i]);
	    }
	    System.out.printf("%n%n");
	} 
}