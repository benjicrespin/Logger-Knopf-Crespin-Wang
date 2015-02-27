package esiea.projet.v0_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FileWritting {
	
	public FileWritting() {
	}
	
	
	void OutputTextPrint(String target, String message){
		File file;
		PrintWriter outputTxt = null;
		
		try{
			file = new File(target);
			outputTxt = new PrintWriter(new FileWriter(file, true));
			outputTxt.printf(message);
			outputTxt.println();
		}catch(IOException e){
			System.out.println(e);
		} finally {
		   try {outputTxt.close() ;} catch (Exception ex) {}
		}
	}
}
