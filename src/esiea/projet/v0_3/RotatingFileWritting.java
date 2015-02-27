package esiea.projet.v0_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RotatingFileWritting {
	
	int counter = 0;
	
	public RotatingFileWritting() {
	}
	
	
	void OutputTextPrint(String target, String message){
		File file;
		PrintWriter outputTxt = null;
		
		try{
				
				file = new File(target.replaceAll(".txt", "") + counter + ".txt");
				if (file.length() <= 500) {
					outputTxt = new PrintWriter(new FileWriter(file, true)) ;
					outputTxt.print(message);
					outputTxt.println();
				}
				else{
					counter++;
				}
		}catch(IOException e){
			System.out.println("Erreur :" + e);
		} finally {
		   try {outputTxt.close() ;} catch (Exception ex) {System.out.println("Erreur! :" + ex);}
		}
	}
}
