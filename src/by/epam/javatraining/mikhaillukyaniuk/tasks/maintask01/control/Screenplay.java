package by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.control;

import by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model.VectorInitialize;
import by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model.VectorCount;
import by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.view.ViewInfo;;

public class Screenplay {

	public void play() {

		double KEY = 65;
		double[] exampleArray = new double[10];
		for (int i = 0; i < exampleArray.length; i++) {
			exampleArray[i] = (int) ((Math.random() * 100));
		}

		VectorInitialize vectorInitialize = new VectorInitialize(exampleArray);
		ViewInfo.arrayPrint(vectorInitialize.getArr(),"Input array is: ");

		ViewInfo.printResult(String.valueOf(VectorCount.findMin
						(vectorInitialize.getArr())),"1)Min value of vector is :");
		ViewInfo.printResult(String.valueOf(VectorCount.findMax
				(vectorInitialize.getArr())),"2) Max value is: ");
		ViewInfo.printResult(String.valueOf(VectorCount.findMiddleArifm
				(vectorInitialize.getArr())),"3) Average arithmetic value is: ");
		ViewInfo.printResult(String.valueOf(VectorCount.findMiddleGeometr
				(vectorInitialize.getArr())),"4) Average geometrical value is: ");
		ViewInfo.printResult(String.valueOf(VectorCount.checksort
				(vectorInitialize.getArr())),"5) Is the array sorted? : ");
		ViewInfo.printResult(String.valueOf(VectorCount.findLocalMin
				(vectorInitialize.getArr())),"6) The local min is: ");
		ViewInfo.printResult(String.valueOf(VectorCount.BinarSearch
				(KEY, (vectorInitialize.getArr()))),"7)Binary search. "
						+ "Index of found element is ");
		ViewInfo.printResult(String.valueOf(VectorCount.LinerSearch
				(KEY, vectorInitialize.getArr())),"8)Linear search. "
						+ "Index of found element is ");
		ViewInfo.arrayPrint(VectorCount.riverse
				(vectorInitialize.getArr()),"9) The riverse vector is: ");
		ViewInfo.arrayPrint(VectorCount.bubbleAscendingsort
				(vectorInitialize.getArr()),"10) The bubble sorted vector is: ");
		ViewInfo.arrayPrint(VectorCount.insertionDescendingsort
				(vectorInitialize.getArr()),"11) The insertion sorted vector is: : ");
		ViewInfo.arrayPrint(VectorCount.selectionAscendingsort
				(vectorInitialize.getArr()),"12) Theselection sorted vector is: ");
	}

	public static void main(String[] args) {
		Screenplay begin = new Screenplay();
		begin.play();
	}
}
