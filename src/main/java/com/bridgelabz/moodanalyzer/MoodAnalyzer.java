package com.bridgelabz.moodanalyzer;
//Refactor
public class MoodAnalyzer {
	String message;
	public MoodAnalyzer(String message) {
		this.message=message;
	}
	public String analyzeMood() {
		if(message.contains("sad")){
			return "SAD";
		} else {
			return "HAPPY";
		}
	}
}
