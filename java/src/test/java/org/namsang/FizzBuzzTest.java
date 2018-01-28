package org.namsang;

import static org.junit.Assert.*;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.junit.Test;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void returnOne() throws Exception {
        assertEquals("1", fizzBuzz.of(1));
    }

    @Test
    public void returnThree() throws Exception {
        assertEquals("Fizz", fizzBuzz.of(3));
    }

    @Test
    public void returnFive() throws Exception {
        assertEquals("Buzz", fizzBuzz.of(5));
    }

    @Test
    public void returnSix() throws Exception {
        assertEquals("Fizz", fizzBuzz.of(6));
    }

    @Test
    public void returnTen() throws Exception {
        assertEquals("Buzz", fizzBuzz.of(10));
    }

    @Test
    public void returnFifteen() throws Exception {
        assertEquals("FizzBuzz", fizzBuzz.of(15));
    }


}
