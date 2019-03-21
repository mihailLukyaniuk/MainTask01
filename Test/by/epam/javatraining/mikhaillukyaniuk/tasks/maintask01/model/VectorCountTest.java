package by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model;

import static org.junit.Assert.*;
import org.junit.Test;

public class VectorCountTest {

    @Test
    public void testfindMax() {
        double[] array = {2, 1, 4, 9};
        double expected = 9;
        assertEquals(expected, VectorCount.findMax(array), 0.001);
    }

    @Test
    public void testfindMin() {
        double[] array = {2, 1, 4, 9};
        double expected = 1;
        assertEquals(expected, VectorCount.findMin(array), 0.001);
    }
    
    @Test
    public void testfindMiddleArifm(){
        double[] array = {2, 1, 4, 9};
        double expected = 4;
        assertEquals(expected,
                VectorCount.findMiddleArifm(array), 0.001);
    }
    
    @Test
    public void testfindMiddleGeometr(){
        double[] array = {2, 1, 4, 9};
        double expected = 2.9129;
        assertEquals(expected, 
                VectorCount.findMiddleGeometr(array), 0.001);
    }
    
    @Test
    public void testchecksort(){
        double[] array = {2, 1, 4, 9};
        boolean expected = false;
        assertEquals(expected, VectorCount.checksort(array));
    }
    
    @Test
    public void testfindLocalMin(){
        double[] array = {2, 1, 4, 9};
        double expected = 1;
        assertEquals(expected, 
                VectorCount.findLocalMin(array), 0.001);
    }
    
    @Test
    public void testBinarSearch(){
        double key = 9;
        double[] array = {2, 1, 4, 9};
        double expected = 3;
        assertEquals(expected, 
                VectorCount.BinarSearch(key, array), 0.001);
    }
    
    @Test
    public void testLinerSearch(){
        double key = 4;
        double[] array = {2, 1, 4, 9};
        double expected = 2;
        assertEquals(expected, 
                VectorCount.LinerSearch(key, array), 0.001);
    }
    
    @Test
    public void testriverse(){
        double[] array = {2, 1, 4, 9};
        double[] expected = {9, 4, 1, 2};
        assertArrayEquals(expected, VectorCount.riverse(array), 0.001);
    }
    
    @Test
    public void testbubbleAscendingsort(){
        double[] array = {2, 1, 4, 9};
        double[] expected = {1, 2, 4, 9};
        assertArrayEquals(expected, 
                VectorCount.bubbleAscendingsort(array), 0.001);
    }
    
    @Test
    public void testinsertionDescendingsort(){
        double[] array = {2, 1, 4, 9};
        double[] expected = {9, 4, 2, 1};
        assertArrayEquals(expected, 
                VectorCount.insertionDescendingsort(array), 0.001);
    }
    
    @Test
    public void testselectionAscendingsort(){
        double[] array = {2, 1, 4, 9};
        double[] expected = {1, 2, 4, 9};
        assertArrayEquals(expected, 
                VectorCount.selectionAscendingsort(array), 0.001);
    }
}
