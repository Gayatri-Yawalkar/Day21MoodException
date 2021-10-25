package com.bridgelabz.junit;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.bridgelabz.moodanalyzer.MoodAnalysisException;
import com.bridgelabz.moodanalyzer.MoodAnalyzer;
public class MoodAnalyzerTest {
	@Test
	public void givenMessage_whenMoodIsHappy_shouldReturnHappy() {
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer("I am Happy");
		try {
		String mood=moodAnalyzer.analyzeMood();
		assertEquals("HAPPY",mood);
		} catch(MoodAnalysisException e) {
			assertEquals("Please Enter Proper Message",e.getMessage());
			
		}
		
	}
	@Test
	public void givenMessage_whenMoodIsSad_shouldReturnSad() {
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer("I am sad");
		try {
		String mood=moodAnalyzer.analyzeMood();
		assertEquals("SAD",mood);
		} catch(MoodAnalysisException e) {
			assertEquals("Please Enter Proper Message",e.getMessage());
			
		}
	}
//null Message
	@Test
	public void givenMessage_whenMoodIsInvalid_shouldThrowException() {
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer(null);
		try {
			moodAnalyzer.analyzeMood();
		} catch(MoodAnalysisException e) {
			assertEquals("Please Enter Proper Message",e.getMessage());
			
		}
	}
	@Test
	public void givenMessage_whenMoodIsNull_shouldThrowException() {
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer(null);
		try {
			moodAnalyzer.analyzeMood();
		} catch(MoodAnalysisException e) {
			assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL,e.type);
			
		}
	}
//Empty Message
	@Test
	public void givenMessage_whenMessageIsEmpty_shouldThrowException() {
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer("");
		try {
			moodAnalyzer.analyzeMood();
		} catch(MoodAnalysisException e) {
			assertEquals("Please Enter Proper Message.Do not enter empty Message",e.getMessage());
			
		}
	}
	@Test
	public void givenMessage_whenMessageIsNull_shouldThrowException() {
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer("     ");
		try {
			moodAnalyzer.analyzeMood();
		} catch(MoodAnalysisException e) {
			assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,e.type);
			
		}
	}
}
