package com.bridgelabz.exceptionhandling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodRefactorTest {
    @Test
    public void analyseMoodRepeatTc1() {
        MoodRefactor mood = new MoodRefactor();
        String actual = mood.analyseMood();
        String expected = "sad";
        assertEquals(expected,actual);
    }
    @Test
    public void analyseMoodRepeatTc2() {
        MoodRefactor mood = new MoodRefactor("I am in happy mood");
        String actual = mood.analyseMood();
        String expected = "happy";
        assertEquals(expected,actual);
    }
}
