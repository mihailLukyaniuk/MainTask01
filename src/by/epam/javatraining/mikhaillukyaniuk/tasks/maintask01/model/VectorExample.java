/**
 * Created by Mikhail Lukyaniuk 19.03.2019.
 * EPAM java course Main Task 01
 * Sorting and Searching Algorithms. Work with vector
 * Model part
 */
package by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model;

public class VectorExample {

    private int arrayExampleIndex;

    public VectorExample() {
    }

    public int getArrayExampleIndex() {
        return arrayExampleIndex;
    }

    public void setArrayExampleIndex(int arrayExampleIndex) {
        this.arrayExampleIndex = arrayExampleIndex;
    }
    
    public VectorExample(int arrayExampleIndex) {
        this.arrayExampleIndex = arrayExampleIndex;
    }

    public double[] create() {
        double[] exampleArray = new double[arrayExampleIndex];
        for (int i = 0; i < exampleArray.length; i++) {
            exampleArray[i] = (int) ((Math.random() * 100));
        }
        return exampleArray;
    }
}
