package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 * 
 */
public interface ISymptomTools {
	/**
	 * Read and count line from a file
	 * @param the path of a file containing one string per line
	 * @return a map with strings extracts and count from the file : symptoms in our case
	 * @throws IOException 
	 */
	public Map<String, Integer> readDataFromFile(String Source) throws IOException;
		
	
	
	/**
	 * Generate a new file with the result
	 * @param resultPath
	 * @param symptoms
	 */
	public void writeSymptoms(String nom, String FilePath, Map<String, Integer> symptoms);

}
