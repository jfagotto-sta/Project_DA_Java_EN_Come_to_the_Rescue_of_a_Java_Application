package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.Map;
import java.io.*;

public class AnalyticsCounter {

	
	public static void main(String args[]) throws Exception {
		
		// first get input
		
		File file = new File ("D://Workspace//Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application//Project02Eclipse/symptoms.txt");
		
		try (BufferedReader reader = new BufferedReader (new FileReader(file))) {
			String line = reader.readLine();
			
			Map<String,Integer> Symptomes = new HashMap<>();

			while (line != null) {
					if (Symptomes.containsKey(line)) {
						Symptomes.put(line, Symptomes.get(line)+1);
						
					}
					else 
						Symptomes.put(line, 1);
					
					line = reader.readLine();
				
					}
				System.out.println(Symptomes);
				line = reader.readLine();  //Next line
		}
	}
}
	
		