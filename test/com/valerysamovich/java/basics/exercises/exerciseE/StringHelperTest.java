package com.valerysamovich.java.basics.exercises.exerciseE;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.valerysamovich.java.basics.exercises.exerciseE.StringHelper;

public class StringHelperTest {

    @Test
    public void testTruncateAInFirstTwoPositions() {
        
        // Create the new StringHelper object
        StringHelper stringHelper = new StringHelper();
        
        // Create the var and Call the method for test with String Value
        String actualValue = stringHelper.truncateAInFirstTwoPositions("BACD");
        // Create the var and assign the value
        String expectedValue = "BCD";
        
        // Assert the values by assertEquals() method
        assertEquals(actualValue, expectedValue);
    }

}