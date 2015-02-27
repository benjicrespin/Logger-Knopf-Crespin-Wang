package esiea.projet.v0_3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Logger {
	//name of class
	private String name;
	//current time
	private String date;
	//message
	private String message;
	//level
	private Level level;
	//private String level;
	

	private String formator;
	
	public String getFormator() {
		return formator;
	}
	public void setFormator(String formator) {
		this.formator = formator;
	}
	//constructor
	public Logger(Class <?> class1){
		setName(class1.getName());
	}
	// function for different level
	public abstract void debug(String message);
	public abstract void info(String message);
	public abstract void error(String message);
	
	//Formator
	
	public String useFormator(){
		switch (getFormator()) {
		case "all":
			return toString();
		case "name":
			return toStringName() + "    " + toStringMessage();
		case "name, level":
			return toStringName() +"    " + toStringLevel() +"    " + toStringMessage();
		case "name, date":
			return toStringName() +"    " + toStringDate() +"    " + toStringMessage();
		case "level":
			return toStringLevel() + "    " + toStringMessage();
		case "level, name":
			return toStringLevel() +"    " + toStringName() +"    " + toStringMessage();
		case "level, date":
			return toStringLevel() +"    " + toStringDate() +"    " + toStringMessage();
		case "date":
			return toStringDate() + "    " + toStringMessage();
		case "date, name":
			return toStringDate() +"    " + toStringName() +"    " + toStringMessage();
		case "date, level":
			return toStringDate() +"    " + toStringLevel() +"    " + toStringMessage();
		default:
			return toString();
		}
	}
	// setter and getter for variables
	public String getDate() {
		return date;
	}
	public void setDate() {
		this.date = getCurrentTime();
	}
	//function for getting current time 
	public String getCurrentTime(){
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(calendar.getTime());
		return dateString;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Enum<Level> getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}
	
	// function for outputting
	@Override
	public String toString() {
		return date + 
				"	[ " + 
				"NAME = " + name + 
				", LEVEL = " + this.level + 
				", MESSAGE = " + message + " ]";
	
	}
	private String toStringName() {
		// TODO Auto-generated method stub
		return "NAME = " + name; 
	}
	private String toStringDate() {
		// TODO Auto-generated method stub
		return date; 
	}
	private String toStringLevel() {
		// TODO Auto-generated method stub
		return "LEVEL = " + level; 
	}
	private String toStringMessage() {
		// TODO Auto-generated method stub
		return "MESSAGE = " + message; 
	}
	public void showMessage(Level level, String message)
	{
		switch(level){
			case DEBUG:
				debug(message);
				//break;
			case INFO:
				info(message);
				//break;
			case ERROR:
				error(message);
				break;
			default:
				break;	
		}
		
	}
}
