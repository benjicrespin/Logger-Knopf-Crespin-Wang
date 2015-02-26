package esiea.projet.v0_3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class getProperties {
	
		public getProperties() {
			
		}
	
		public String getPropValues() throws IOException {
			 
			String result = "";
			Properties prop = new Properties();
			String propFileName = "./resources/config.properties";
			 
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
			 
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
			throw new FileNotFoundException("properties file '" + propFileName + "' not found in the classpath");
			}
			 
			Date time = new Date(System.currentTimeMillis());
			 
			// get the property value and print it out
			String level = prop.getProperty("level");
			String formator = prop.getProperty("formator");
			String cible1 = prop.getProperty("cible1");
			String cible2 = prop.getProperty("cible2");
			String cible3 = prop.getProperty("cible3");
			String cible3Path = prop.getProperty("cible3.path");
			 
			result = "[FOR TEST USE ONLY = " + level + ", " + formator + ", " + cible1 + ", " + cible2 + ", " + cible3 + ", " + cible3Path + "]";
			System.out.println(result + "\nProperties File loaded at " + time);
			return result;
			}
		
}
