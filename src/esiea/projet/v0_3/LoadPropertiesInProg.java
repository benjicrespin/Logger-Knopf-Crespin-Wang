package esiea.projet.v0_3;

import java.awt.List;
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
	
	public String getTarget2() {
		return this.loadedProp.get(3);
	}
	
	public String getTarget3() {
		return this.loadedProp.get(4);
	}
	
	public String getTarget4() {
		return this.loadedProp.get(5);
	}
	
	public String getTarget5() {
		return this.loadedProp.get(6);
	}
}
