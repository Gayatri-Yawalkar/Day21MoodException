package com.bridgelabz.junit;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.bridgelabz.moodanalyzer.MoodAnalyzer;
public class MoodAnalyzerTest {
	@Test
	public void givenMessage_whenMoodIsHappy_shouldReturnHappy() {
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer("I am Happy");
		String mood=moodAnalyzer.analyzeMood();
		assertEquals("HAPPY",mood);
	}
	@Test
	public void givenMessage_whenMoodIsSad_shouldReturnSad() {
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer("I am sad");
		String mood=moodAnalyzer.analyzeMood();
		assertEquals("SAD",mood);
	}
	@Test
	public void givenMessage_whenMessageIsNull_shouldReturnHappy() {
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer(null);
		String mood=moodAnalyzer.analyzeMood();
		assertEquals("HAPPY",mood);
	}
}
