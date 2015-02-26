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
	
	public String getFormator(String formator) {
		return formator = this.loadedProp[1];
	}
	
	public String getTarget1(String target1) {
		return target1 = this.loadedProp[2];
	}
	
	public String getTarget2(String target2) {
		return target2 = this.loadedProp[3];
	}
	
	public String getTarget3(String target3) {
		return target3 = this.loadedProp[4];
	}
	
	public String getTarget3Path(String target3Path) {
		return target3Path = this.loadedProp[5];
	}
}
