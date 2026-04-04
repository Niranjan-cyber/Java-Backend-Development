package com.telusko;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    @Test
    void testReverseString_oneWord() {
        ReverseString reverse = new ReverseString();

        assertEquals("avaJ", reverse.reverseString("Java"));
    }

    @Test
    void testReverseString_MultipleWords(){
    }
}
