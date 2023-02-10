package com.bridgelabz.exceptionhandling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalysisExceptionUc3Test {
    @Test
    public void analyseMood() throws MoodAnalyserException{
        MoodAnalysisExceptionUc3 mood = new MoodAnalysisExceptionUc3();
        try {
            String actual = mood.analyseMood(null);
        }catch(MoodAnalyserException m) {
            assertEquals(MoodAnalyserException.enumType.NULL_MOOD,m.type);
        }
    }
    @Test
    public void analyseMood1() throws MoodAnalyserException {
        MoodAnalysisExceptionUc3 mood = new MoodAnalysisExceptionUc3();
        try {
            String actual = mood.analyseMood1("");
        }catch(MoodAnalyserException m) {
            assertEquals(MoodAnalyserException.enumType.EMPTY_MOOD,m.type);
        }
    }
}
