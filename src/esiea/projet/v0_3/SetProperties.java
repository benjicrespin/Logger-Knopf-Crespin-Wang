package esiea.projet.v0_3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

public class SetProperties {
	
	public Level level;
	public String console, formator, target;
	public ArrayList<String> targets;
	Properties prop;
	String propFileName;
	
	public SetProperties() {
		targets = new ArrayList<String>();
		prop = new Properties();
		propFileName = "config.properties";
	}
	
	public Level setLevel(Level level){
		return this.level = level;
	}
	
	public String setFormator(String formator){
		return this.formator = formator;
	}
	
	public String setConsole(String boole) {
		return console = boole;
	}
	
	public ArrayList<String> setTarget(String target){
		targets.add(target);
		return targets;
	}
	
	public void changePropertiesFile() {
		
		Properties prop = new Properties();
		String propFileName = "config.properties";
		int count = 0;
		
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
	 
		try {
			if (inputStream != null)
				prop.load(inputStream);
		} catch(IOException e) {
			new FileNotFoundException("properties file '" + propFileName + "' not found in the classpath");
		}
	 
	 
		// get the property value and print it out
		prop.setProperty("level", level.toString());
		prop.setProperty("formator", formator);
		prop.setProperty("console", console);
		for(String target : targets){
			prop.setProperty("target" + count, target);
			count++;
		}
	}
}
