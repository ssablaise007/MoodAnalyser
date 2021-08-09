package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoodAnalyzerTest {
    @Test
    public void testMoodAnalyser() throws Exception, MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a sad message");
        Assertions.assertEquals(mood, "HAPPY");
    }

    @Test
    public void happyMoodAnalyser() throws Exception, MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a happy message");
        Assertions.assertEquals(mood, "HAPPY");
    }

    @Test
    public void nullMoodAnalyser() throws Exception, MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood(null);
        Assertions.assertEquals(mood, "SILAR");
    }

    @Test
    public void throwMoodAnalyser_byuser() throws Exception {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            String mood = moodAnalyser.analyseMood(null);
            Assertions.assertEquals(mood, "SILAR");
        } catch (MoodAnalyserException ex) {
            System.out.println(ex.getMessage());
        }
    }