package by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VectorExtremsTest {
    
    @Test
    public void testfindMax() {
        double[] array = {2, 1, 4, 9};
        double expected = 9;
        assertEquals(expected, VectorExtrems.findMax(array), 0.001);
    }

    @Test
    public void testfindMin() {
        double[] array = {2, 1, 4, 9};
        double expected = 1;
        assertEquals(expected, VectorExtrems.findMin(array), 0.001);
    }
    @Test
    public void testfindLocalMin(){
        double[] array = {2, 1, 4, 9};
        double expected = 1;
        assertEquals(expected, 
                VectorExtrems.findLocalMin(array), 0.001);
    }
}
