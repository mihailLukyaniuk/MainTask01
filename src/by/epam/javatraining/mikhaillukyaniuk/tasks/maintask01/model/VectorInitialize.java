/**
 * Created by Mikhail Lukyaniuk 19.03.2019. EPAM java course Main Task 01
 * Sorting and Searching Algorithms. Work with vector Model part
 */
package by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model;

public class VectorInitialize {

    private double[] array;
    private int indexofarray;

    public VectorInitialize(double[] array, int indexofarray) {
        this.array = array;
        this.indexofarray = indexofarray;
    }

    public VectorInitialize(double[] array) {
        this.array = array;
    }
    
    public VectorInitialize() {
    }

    public double[] getArray() {
        return array;
    }

    public void setArray(double[] array) {
        this.array = array;
    }

    public int getIndexofarray() {
        return indexofarray;
    }

    public void setIndexofarray(int indexofarray) {
        this.indexofarray = indexofarray;
    }



}
