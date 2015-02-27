package esiea.projet.v0_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class RotatingFileWritting {
	
	ArrayList<String> alphabetFinal; 
	ArrayList<Float> smoothedProbabilities;
	int counter = 0;
	
	public RotatingFileWritting() {
		alphabetFinal = new ArrayList<String>();
		smoothedProbabilities = new ArrayList<Float>();
	}
	
	
	void OutputTextPrint(String target, String message){
		File file;
		PrintWriter outputTxt = null;
		
		try{
				file = new File(target.replaceAll(".txt", "") + counter + ".txt");
				if (file.length() < 100) {
					outputTxt = new PrintWriter(new FileWriter(file, true)) ;
					outputTxt.print(message);
					outputTxt.println();
				}
				else{
					counter++;
				}
		}catch(IOException e){
			System.out.println(e);
		} finally {
		   try {outputTxt.close() ;} catch (Exception ex) {}
		}
	}
}
