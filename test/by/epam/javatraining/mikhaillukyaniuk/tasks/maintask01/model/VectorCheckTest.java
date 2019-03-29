package by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model;

import static org.junit.Assert.*;
import org.junit.Test;

public class VectorCheckTest {

    @Test
    public void testchecksort(){
        double[] array = {2, 1, 4, 9};
        boolean expected = false;
        assertEquals(expected, VectorCheck.checkSort(array));
    }
    
    
    

    

    

}
