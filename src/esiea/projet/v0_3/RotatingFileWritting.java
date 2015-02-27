package esiea.projet.v0_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class RotatingFileWritting {
	
	public String date;
	
	public RotatingFileWritting() {
		date = getCurrentTime();
	}
	
	public String getCurrentTime(){
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("HH_mm_ss");
		String dateString = formatter.format(calendar.getTime());
		return dateString;
	}
	
	void OutputTextPrint(String target, String message){
		PrintWriter outputTxt = null;
		
		
		
		File file = new File(target.replaceAll(".txt", "") + date + ".txt");
		
		try{

				//new File(target.replaceAll(".txt", "") + date + ".txt");
				outputTxt = new PrintWriter(new FileWriter(file, true)) ;
				if (file.length() <= 250) {
					outputTxt.print(message);
					outputTxt.println();
					
				}

		}catch(IOException e){
			System.out.println("Erreur :" + e);
		} finally {
		   try {outputTxt.close() ;} catch (Exception ex) {System.out.println("Erreur! :" + ex);}
		}
	}
}
