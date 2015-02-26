package esiea.projet.v0_3;

import java.io.IOException;

public class loadPropertiesInProg {
	
	getProperties loader;
	String[] loadedProp;  // an array containing the properties (size of 6 String)
	// In this order : level, formator, target1, target2, target3, target3.path
	
	public loadPropertiesInProg() throws IOException {
		loader = new getProperties();
		loadedProp = new String[6];
		loadedProp = loader.getPropValues();
	}

	public String getLevel(String level) {
		return level = this.loadedProp[0];
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
