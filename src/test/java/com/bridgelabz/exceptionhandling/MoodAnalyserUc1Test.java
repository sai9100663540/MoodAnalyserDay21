package com.bridgelabz.exceptionhandling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyserUc1Test {
    @Test
    public void analyseMood() {
        MoodAnalyserUc1 mood = new MoodAnalyserUc1();
        String actual = mood.analyseMood("happy");
        String expected = "happy";
        assertEquals(expected,actual);
    }
    @Test
    public void analyseMoodTc1() {
        MoodAnalyserUc1 mood = new MoodAnalyserUc1();
        String actual = mood.analyseMoodTc1("I am in sad mood");
        String expected = "sad";
        assertEquals(expected,actual);
    }
    @Test
    public void analyseMoodTc2() {
        MoodAnalyserUc1 mood = new MoodAnalyserUc1();
        String actual = mood.analyseMoodTc2("I am in any mood");
        String expected = "happy";
        assertEquals(expected,actual);
    }

}
