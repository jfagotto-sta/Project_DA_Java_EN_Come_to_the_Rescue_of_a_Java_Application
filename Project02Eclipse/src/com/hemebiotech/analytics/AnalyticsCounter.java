package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;
import javax.swing.JOptionPane;

public class AnalyticsCounter {
	
	
	public static void main(String args[]) throws Exception {
		
		//Get users parameters
		
		String source = JOptionPane.showInputDialog("Merci d'indiquer le chemin complet de la liste de symptomes non comptés");
		JOptionPane.showMessageDialog(null, source);
		
		String nom = JOptionPane.showInputDialog("Merci d'indiquer le nom du fichier qui contiendra le comptage des symptomes");
		JOptionPane.showMessageDialog(null, nom);
		
		String filepath = JOptionPane.showInputDialog("Merci d'indiquer le chemin du dossier qui contiendra le fichier resultat");
		JOptionPane.showMessageDialog(null, filepath);
		
		
		//first get input
		AnalyticsCounter counter = new AnalyticsCounter();
		
		counter.analyse(source, nom, filepath);
	}

	public void analyse(String source, String nom, String filepath) throws IOException {
		SymptomDataFromFile reader = new SymptomDataFromFile();
		Map<String, Integer> symptoms = reader.readDataFromFile(source);
		
		//TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		
	
		
		//System.out.println("Votre nouveau fichier est disponible dans le dossier spécifié ultérieurement.");
		
		//Then put them into a new file
		
		reader.writeSymptoms(nom +".txt",filepath, symptoms);
	}
}
		