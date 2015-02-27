package esiea.projet.v0_3;

import java.util.ArrayList;

public class LoadPropertiesInProg {
	
	GetProperties loader;
	ArrayList<String> loadedProp;  // an array containing the properties (size of 6 String)
	// In this order : level, formator, target1, target2, target3, target3.path
	
	public LoadPropertiesInProg() {
		loader = new GetProperties();
		loadedProp = new ArrayList<String>();
		loadedProp = loader.getPropValues();
	}

	public Level getLevel() {
		switch (this.loadedProp.get(0)) {
		case "DEBUG":
			return Level.DEBUG;
		case "INFO":
			return Level.INFO;
		case "ERROR":
			return Level.ERROR;
		default:
			System.out.println("Wrong format for the level property, setting default on ERROR");
			return Level.ERROR;
		}
	}
	
	public String getFormator() {
		return this.loadedProp.get(1);
	}
	
	public String getConsole() {
		return this.loadedProp.get(2);
	}
	
	public ArrayList<String> getTargets() {
		ArrayList<String> loadedPropCopy = new ArrayList<String>();
		loadedPropCopy.addAll(loadedProp);
		loadedPropCopy.remove(2);
		loadedPropCopy.remove(1);
		loadedPropCopy.remove(0);
		return loadedPropCopy;
	}
}
