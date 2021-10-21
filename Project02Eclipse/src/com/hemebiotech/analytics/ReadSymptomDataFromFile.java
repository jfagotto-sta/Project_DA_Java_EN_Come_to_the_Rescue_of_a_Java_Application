package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	@Override
	public Map<String, Integer> readDataFromFile(String filepath) throws IOException{
		
		Map<String,Integer> Symptoms = new HashMap<>();
		
		try (BufferedReader reader = new BufferedReader (new FileReader(filepath))) {
			
			String line = reader.readLine();

			while (line != null) {
					if (Symptoms.containsKey(line)) {
						Symptoms.put(line, Symptoms.get(line)+1);
						
					}
					else 
						Symptoms.put(line, 1);
					
					line = reader.readLine();
			}	
		}
		return Symptoms;
	}

	@Override
	public void writeSymptoms(String resultPath, Map<String, Integer> Symptoms) {
		try {
			FileWriter writer = new FileWriter(resultPath + "toto.txt");
			writer.write(Symptoms.toString());
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}	
