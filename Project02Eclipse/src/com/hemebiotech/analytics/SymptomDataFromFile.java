package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class SymptomDataFromFile implements ISymptomTools {

	@Override
	public Map<String, Integer> readDataFromFile(String Source) throws IOException{
		
		Map<String,Integer> Symptoms = new HashMap<>();
		
		try (BufferedReader reader = new BufferedReader (new FileReader(Source))) {
			
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
	public void writeSymptoms(String name, String FilePath, Map<String, Integer> Symptoms) {
		try {
			FileWriter writer = new FileWriter(FilePath + name);
			writer.write(Symptoms.toString());
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}	
