package com.hemebiotech.analytics;

import java.util.Map;

public class AnalyticsCounter {
	
	static String FilePath = "D:/Workspace/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt";
	
	public static void main(String args[]) throws Exception {
		
		// first get input
		
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile();
		Map<String,Integer> Symptoms = reader.readDataFromFile(FilePath);
		
		System.out.println(Symptoms);
		
		reader.writeSymptoms("D:/Workspace/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/", Symptoms);
	}
}
	
		