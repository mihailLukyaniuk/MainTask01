package by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model;

import org.junit.Assert;
import org.junit.Test;

public class VectorCountTest1 {

    @Test
    public void testfindMax() {
        double[] array = {2, 1, 4, 9};
        double expected = 9;
        Assert.assertEquals(expected, VectorCount.findMax(array), 0.001);
    }

    @Test
    public void testfindMin() {
        double[] array = {2, 1, 4, 9};
        double expected = 1;
        Assert.assertEquals(expected, VectorCount.findMin(array), 0.001);
    }


    
    @Test
    public void testfindMiddleArifm(){
        double[] array1 = {2, 1, 4, 9};
        double expected = 4;
        Assert.assertEquals(expected,
                VectorCount.findMiddleArifm(array1), 0.001);
    }
    
    @Test
    public void testfindMiddleGeometr(){
        double[] array1 = {2, 1, 4, 9};
        double expected = 2.9129;
        Assert.assertEquals(expected, 
                VectorCount.findMiddleGeometr(array1), 0.001);
    }
    
    @Test
    public void testchecksort(){
        double[] array1 = {2, 1, 4, 9};
        boolean expected = false;
        Assert.assertEquals(expected, VectorCount.checksort(array1));
    }
    
    @Test
    public void testfindLocalMin(){
        double[] array1 = {2, 1, 4, 9};
        double expected = 1;
        Assert.assertEquals(expected, 
                VectorCount.findLocalMin(array1), 0.001);
    }
    
    @Test
    public void testBinarSearch(){
        double key = 9;
        double[] array1 = {2, 1, 4, 9};
        double expected = 3;
        Assert.assertEquals(expected, 
                VectorCount.BinarSearch(key, array1), 0.001);
    }
    
    @Test
    public void testLinerSearch(){
        double key = 4;
        double[] array1 = {2, 1, 4, 9};
        double expected = 2;
        Assert.assertEquals(expected, 
                VectorCount.LinerSearch(key, array1), 0.001);
    }
    
    @Test
    public void testriverse(){
        double[] array = {2, 1, 4, 9};
        double[] arrayexpected = {9, 4, 1, 2};
        Assert.assertArrayEquals(arrayexpected, VectorCount.riverse(array), 0.001);
    }
    
    @Test
    public void testbubbleAscendingsort(){
        double[] array = {2, 1, 4, 9};
        double[] arrayexpected = {1, 2, 4, 9};
        Assert.assertArrayEquals(arrayexpected, 
                VectorCount.bubbleAscendingsort(array), 0.001);
    }
    
    @Test
    public void testinsertionDescendingsort(){
        double[] array = {2, 1, 4, 9};
        double[] arrayexpected = {9, 4, 2, 1};
        Assert.assertArrayEquals(arrayexpected, 
                VectorCount.insertionDescendingsort(array), 0.001);
    }
    
    @Test
    public void testselectionAscendingsort(){
        double[] array = {2, 1, 4, 9};
        double[] arrayexpected = {1, 2, 4, 9};
        Assert.assertArrayEquals(arrayexpected, 
                VectorCount.selectionAscendingsort(array), 0.001);
    }
    
    
}
