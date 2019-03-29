package by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class VectorSortTest {
        @Test
    public void testbubbleAscendingsort(){
        double[] array = {2, 1, 4, 9};
        double[] expected = {1, 2, 4, 9};
        assertArrayEquals(expected, 
                VectorSort.makeBubbleAscendingsort(array), 0.001);
    }
    
    @Test
    public void testinsertionDescendingsort(){
        double[] array = {2, 1, 4, 9};
        double[] expected = {9, 4, 2, 1};
        assertArrayEquals(expected, 
                VectorSort.makeInsertionDescendingsort(array), 0.001);
    }
    
    @Test
    public void testselectionAscendingsort(){
        double[] array = {2, 1, 4, 9};
        double[] expected = {1, 2, 4, 9};
        assertArrayEquals(expected, 
                VectorSort.makeSelectionAscendingsort(array), 0.001);
    }
}
