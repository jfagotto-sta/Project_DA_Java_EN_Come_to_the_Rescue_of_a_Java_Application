package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 * 
 */
public interface ISymptomReader {
	/**
	 * Read and count line from a file
	 * @param the path of a file containing one string per line
	 * @return a map with strings extracts and count from the file : symptomes in our case
	 */
	public Map<String, Integer> readDataFromFile (String filepath);
	
	/**
	 * Generate a new file with the result
	 * @param resultPath
	 * @param symptoms
	 */
	
	public void writeSymptoms(String resultPath, Map<String, Integer> symptoms);

	List<String> GetSymptoms();
}
