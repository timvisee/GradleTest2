package com.timvisee.test2;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Test2Test {

    @Test
    public void subtractTest() {
        int[][] subtractValues = {
                {4, 2, 2},
                {8, 1, 7},
                {3, 4, -1 + 1},
                {-6, -2, -4}
        };

        for(int[] values : subtractValues) {
            assertEquals(
                    Test2.subtract(values[0], values[1]),
                    values[2]
            );
        }
    }
}
