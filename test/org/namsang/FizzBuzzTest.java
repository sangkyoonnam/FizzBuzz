package org.namsang;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void returnOne() throws Exception {
        assertEquals("1", fizzBuzz.of(1));
    }
}
