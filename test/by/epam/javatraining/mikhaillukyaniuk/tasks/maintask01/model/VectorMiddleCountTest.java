package by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VectorMiddleCountTest {
        @Test
    public void testfindMiddleArifm(){
        double[] array = {2, 1, 4, 9};
        double expected = 4;
        assertEquals(expected,
                VectorMiddleCount.findMiddleArifm(array), 0.001);
    }
    
    @Test
    public void testfindMiddleGeometr(){
        double[] array = {2, 1, 4, 9};
        double expected = 2.9129;
        assertEquals(expected, 
                VectorMiddleCount.findMiddleGeometr(array), 0.001);
    }
}
