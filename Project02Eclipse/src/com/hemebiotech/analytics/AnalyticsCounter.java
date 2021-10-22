package com.hemebiotech.analytics;

import java.util.Map;
import javax.swing.JOptionPane;

public class AnalyticsCounter {
	
	
	public static void main(String args[]) throws Exception {
		
		String Source = JOptionPane.showInputDialog("Merci d'indiquer le chemin complet de la liste de symptomes non compt�s");
		JOptionPane.showMessageDialog(null, Source);
		
		String nom = JOptionPane.showInputDialog("Merci d'indiquer le nom du fichier qui contiendra le comptage des symptomes");
		JOptionPane.showMessageDialog(null, nom);
		
		String Filepath = JOptionPane.showInputDialog("Merci d'indiquer le chemin du dossier qui contiendra le fichier resultat");
		JOptionPane.showMessageDialog(null, Filepath);
		
		
		// first get input
		
		SymptomDataFromFile reader = new SymptomDataFromFile();
		Map<String,Integer> Symptoms = reader.readDataFromFile(Source);
		
		System.out.println(Symptoms);
		
		reader.writeSymptoms(nom +".txt",Filepath, Symptoms);
	}
}
	
		