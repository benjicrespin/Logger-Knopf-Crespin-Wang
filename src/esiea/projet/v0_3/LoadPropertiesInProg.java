package esiea.projet.v0_3;

import java.io.IOException;

public class LoadPropertiesInProg {
	
	GetProperties loader;
	String[] loadedProp;  // an array containing the properties (size of 6 String)
	// In this order : level, formator, target1, target2, target3, target3.path
	
	public LoadPropertiesInProg() throws IOException {
		loader = new GetProperties();
		loadedProp = new String[6];
		loadedProp = loader.getPropValues();
	}

	public String getLevel() {
		switch (this.loadedProp[0]) {
		case "DEBUG":
			return this.loadedProp[0];
		case "INFO":
			return this.loadedProp[0];
		case "ERROR":
			return this.loadedProp[0];
		default:
			System.out.println("Wrong format for the level property, setting default on ERROR");
			return "ERROR";
		}
	}
	
	public String getFormator() {
		return this.loadedProp[1];
	}
	
	public String getTarget1() {
		return this.loadedProp[2];
	}
	
	public String getTarget2() {
		return this.loadedProp[3];
	}
	
	public String getTarget3() {
		return this.loadedProp[4];
	}
	
	public String getTarget3Path() {
		return this.loadedProp[5];
	}
}
