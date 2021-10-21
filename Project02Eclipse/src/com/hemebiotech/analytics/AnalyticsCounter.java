package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.Map;
import java.io.*;

public class AnalyticsCounter {
	

	
	public static void main(String args[]) throws Exception {
		
		// first get input
		
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile();
		Map<String,Integer> Symptoms = reader.readDataFromFile("D:/Workspace/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt");
		
		System.out.println(Symptoms);
	}
}
	
		