package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoodAnalyzerTest {

    @Test
    public void givenNullMood_ShouldReturnHappy_Test() {
        MoodAnalyser.MoodAnalyzer moodAnalyzer = new MoodAnalyser.MoodAnalyzer();
        String mood = null;
        try {
            mood = moodAnalyzer.analyzeMood("");
            Assertions.assertEquals("HAPPY", mood);
        } catch (MoodAnalyzerException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}