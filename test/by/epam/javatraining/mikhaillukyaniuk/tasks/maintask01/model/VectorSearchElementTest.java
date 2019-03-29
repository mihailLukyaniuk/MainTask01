package by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VectorSearchElementTest {
        @Test
    public void testBinarSearch(){
        double key = 9;
        double[] array = {2, 1, 4, 9};
        double expected = 3;
        assertEquals(expected, 
                VectorSearchElement.makeBinarSearch(key, array), 0.001);
    }
    
    @Test
    public void testLinerSearch(){
        double key = 4;
        double[] array = {2, 1, 4, 9};
        double expected = 2;
        assertEquals(expected, 
                VectorSearchElement.makeLinerSearch(key, array), 0.001);
    }
}
