package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class SymptomDataFromFile implements ISymptomTools {

	@Override
	public Map<String, Integer> readDataFromFile(String source) throws IOException{
		
		Map<String,Integer> symptoms = new TreeMap<>();
		
		try (BufferedReader reader = new BufferedReader (new FileReader(source))){ 
			
			String line = reader.readLine();

			while (line != null) {
					if (symptoms.containsKey(line)) {
						symptoms.put(line, symptoms.get(line)+1);
						
					}
					else 
						symptoms.put(line, 1);
					
					line = reader.readLine();					
			}
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		return symptoms;
	}
	

	@Override
	public void writeSymptoms(String name, String filePath, Map<String, Integer> symptoms) {
		String finalKey;
		
		try (FileWriter writer = (new FileWriter(filePath + name))) {
			Set<Map.Entry<String, Integer>> entries = symptoms.entrySet();
			for(Map.Entry<String, Integer> entry : entries) {
				finalKey = entry.getKey() + " = " + entry.getValue() + "\n";
				System.out.println(finalKey);
				writer.write(finalKey);
			}
	
			writer.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
	}
		
}
