package by.epam.javatraining.mikhaillukyaniuk.tasks.maintask01.model;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class VectorRiverseTest {
        @Test
    public void testriverse(){
        double[] array = {2, 1, 4, 9};
        double[] expected = {9, 4, 1, 2};
        assertArrayEquals(expected, VectorRiverse.makeRiverse(array), 0.001);
    }
}
