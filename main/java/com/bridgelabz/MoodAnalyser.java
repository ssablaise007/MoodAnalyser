package com.bridgelabz;

public class MoodAnalyser {

    public static class MoodAnalyzer {

        public String analyzeMood(String message) throws MoodAnalyzerException {

            if(message == null || message.isEmpty()) {
                throw new MoodAnalyzerException("Please enter proper message");
            }

            if(message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }
    }
}
