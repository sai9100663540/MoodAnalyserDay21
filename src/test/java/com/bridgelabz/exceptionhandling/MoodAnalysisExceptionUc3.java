package com.bridgelabz.exceptionhandling;
public class MoodAnalysisExceptionUc3 {
    public String analyseMood(String message) throws MoodAnalyserException{

        if(message == null) {
            throw new MoodAnalyserException("NULL_MOOD",MoodAnalyserException.enumType.NULL_MOOD);
        }

        else if(message.contains("happy"))
        {
            return "happy";
        }
        else if(message.contains("sad")){
            return "sad";
        }
        else {
            throw new MoodAnalyserException("EMPTY_MOOD",MoodAnalyserException.enumType.EMPTY_MOOD);
        }
    }
    public String analyseMood1(String message) throws MoodAnalyserException{

        if(message == null) {
            throw new MoodAnalyserException("NULL_MOOD",MoodAnalyserException.enumType.NULL_MOOD);
        }

        else if(message.contains("happy"))
        {
            return "happy";
        }
        else if(message.contains("sad")){
            return "sad";
        }
        else {
            throw new MoodAnalyserException("EMPTY_MOOD",MoodAnalyserException.enumType.EMPTY_MOOD);
        }
    }
}
