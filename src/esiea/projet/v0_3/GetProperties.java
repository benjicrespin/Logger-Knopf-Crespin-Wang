package esiea.projet.v0_3;

import java.awt.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

public class GetProperties {
	
		ArrayList<String> loadedProp;
	
		public GetProperties() {
			loadedProp = new ArrayList<String>();
		}
	
		public ArrayList<String> getPropValues() {
			 
			Properties prop = new Properties();
			String propFileName = "config.properties";
			 
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
			 
			try {
			if (inputStream != null)
				prop.load(inputStream);
			} catch(IOException e) {
				new FileNotFoundException("properties file '" + propFileName + "' not found in the classpath");
			}
			 
			 
			// get the property value and print it out
			loadedProp.add(prop.getProperty("level"));
			loadedProp.add(prop.getProperty("formator"));
			loadedProp.add(prop.getProperty("console"));
			loadedProp.add(prop.getProperty("target2"));
			loadedProp.add(prop.getProperty("target3"));
			loadedProp.add(prop.getProperty("target4"));
			loadedProp.add(prop.getProperty("target5"));
			
			return loadedProp;
			}
		
}
