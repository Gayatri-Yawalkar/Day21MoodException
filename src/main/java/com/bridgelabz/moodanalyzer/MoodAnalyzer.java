package com.bridgelabz.moodanalyzer;
//Uc2
public class MoodAnalyzer {
	String message;
	public MoodAnalyzer(String message) {
		this.message=message;
	}
	public String analyzeMood() {
		try {
			if(message.contains("sad")){
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch(NullPointerException e) {
			return "HAPPY";
		}
	}
}
