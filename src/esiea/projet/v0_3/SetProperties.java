package esiea.projet.v0_3;

import java.util.ArrayList;

public class SetProperties {
	
	public Level level;
	public String console, formator, target;
	public ArrayList<String> targets;
	
	public SetProperties() {
		targets = new ArrayList<String>();
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
}
