package com.bridgelabz.junit;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.bridgelabz.moodanalyzer.MoodAnalyzer;
public class MoodAnalyzerTest {
	@Test
	public void givenMessage_whenMoodIsHappy_shouldReturnHappy() {
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer();
		String mood=moodAnalyzer.analyzeMood("I am Happy");
		assertEquals("HAPPY",mood);
	}
	@Test
	public void givenMessage_whenMoodIsSad_shouldReturnSad() {
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer();
		String mood=moodAnalyzer.analyzeMood("I am sad");
		assertEquals("SAD",mood);
	}
}
