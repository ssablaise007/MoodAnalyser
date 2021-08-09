package com.bridgelabz;

public class MoodAnalyser {
    public String analyseMood(String message) throws MoodAnalyserException {
        if (message == null || message.isEmpty()) {
            throw new MoodAnalyserException("Submit A name");
        }
        if (message.contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }

    public class MoodAnalyzer {
    }
}