package com.bridgelabz.exceptionhandling;

public class MoodAnalyserException extends Throwable {
    enum enumType{
        EMPTY_MOOD,NULL_MOOD
    }
    private String message;
    enumType type;

    public MoodAnalyserException(String message , enumType type) {
        super(message);
        //this.message = message;
        this.type = type;
    }

}
