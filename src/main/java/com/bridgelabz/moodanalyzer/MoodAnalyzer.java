package com.bridgelabz.moodanalyzer;
//Uc3
public class MoodAnalyzer {
	String message;
	public MoodAnalyzer(String message) {
		this.message=message;
	}
	public String analyzeMood() throws MoodAnalysisException {
		try {
			if(message.length()==0) {
				throw new MoodAnalysisException("Please Enter Proper Message.Do not enter empty Message",MoodAnalysisException.ExceptionType.ENTERED_EMPTY);
			}
			if(message.contains("sad")){
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch(NullPointerException e) {
			throw new MoodAnalysisException("Please Enter Proper Message",MoodAnalysisException.ExceptionType.ENTERED_NULL);
		}
	}
}
