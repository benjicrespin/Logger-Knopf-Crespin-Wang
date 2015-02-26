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
	//constuctor
	public Logger(Class <?> class1){
		setName(class1.getName());
	}
	// function for diffirent level
	public abstract void debug(String message);
	public abstract void info(String message);
	public abstract void error(String message);
	
	// setter and getter for variable
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
				", LEVEL = " + level + 
				", MESSAGE = " + message + " ]";
	
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
