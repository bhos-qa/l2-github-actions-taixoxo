package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringLengthFinderTest {
    @Test
    public void checkFindLength(){
        StringLengthFinder obj = new StringLengthFinder();
        assertEquals(5,obj.findLength("salam"));
    }
}