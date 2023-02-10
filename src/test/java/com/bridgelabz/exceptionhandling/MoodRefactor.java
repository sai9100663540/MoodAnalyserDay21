package com.bridgelabz.exceptionhandling;

public class MoodRefactor {
    public String message;

    public MoodRefactor() {
        message = "I am in sad mood";
    }
    public MoodRefactor(String message) {
        this.message = message;
    }
    public String analyseMood() {
        if(message.contains("I am in sad mood"))
        {
            return "sad";
        }else {
            return "happy";
        }
    }
}
