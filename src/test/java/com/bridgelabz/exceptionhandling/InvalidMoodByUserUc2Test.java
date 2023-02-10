package com.bridgelabz.exceptionhandling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvalidMoodByUserUc2Test {
    @Test
    public void analyseMoodNull() {
        InvalidMoodByUserUc2 mood = new InvalidMoodByUserUc2();
        String actual = mood.analyseMoodNull(null);
        String expected = "happy";
        assertEquals(expected,actual);
    }
}
