package esiea.projet.v0_3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class GetProperties {
	
		String[] loadedProp;
	
		public GetProperties() {
			loadedProp = new String[6];
		}
	
		public String[] getPropValues() throws IOException {
			 
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
			loadedProp[0] = prop.getProperty("level");
			loadedProp[1] = prop.getProperty("formator");
			loadedProp[2] = prop.getProperty("target1");
			loadedProp[3] = prop.getProperty("target2");
			loadedProp[4] = prop.getProperty("target3");
			loadedProp[5] = prop.getProperty("target3.path");
			 
			result = "[FOR TEST USE ONLY = " + loadedProp[0] + ", " + loadedProp[1] + ", " + loadedProp[2] + ", " + loadedProp[3] + ", " + loadedProp[4] + ", " + loadedProp[5] + "]";
			System.out.println(result + "\nProperties File loaded at " + time);
			return loadedProp;
			}
		
}
