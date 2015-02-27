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

	public String getLevel() {
		switch (this.loadedProp.get(0)) {
		case "DEBUG":
			return this.loadedProp.get(0);
		case "INFO":
			return this.loadedProp.get(0);
		case "ERROR":
			return this.loadedProp.get(0);
		default:
			System.out.println("Wrong format for the level property, setting default on ERROR");
			return "ERROR";
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
		loadedPropCopy.remove(0);
		loadedPropCopy.remove(1);
		return this.loadedProp;
	}
}
