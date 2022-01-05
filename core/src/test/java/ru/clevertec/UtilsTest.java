package ru.clevertec;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilsTest {

    @Test
    public void whenAllPositiveNumbers_thenCorrect() {
        Utils utils = new Utils();

        assertTrue(utils.isAllPositiveNumbers("1", "2", "3", "4", "5", "6", "7", "8", "9", "10"));
        assertFalse(utils.isAllPositiveNumbers("1", "-2", "3", "4", "5", "6", "7", "8", "y", "10"));
    }
}
