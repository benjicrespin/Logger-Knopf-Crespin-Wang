package esiea.projet.v0_3;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// make a new class for test
		MyClass myClass = new MyClass();
		// start function init()
		getProperties config = new getProperties();
		
		config.getPropValues();
		
		myClass.init();
	}

}
