package esiea.projet.v0_3;

public class MyClass {
	
	private LoggerFactory loggerFactoryConsole = new LoggerFactoryConsole();
	private Logger loggerConsole = loggerFactoryConsole.createLogger(MyClass.class);
	private LoggerFactory loggerFactoryDB = new LoggerFactoryDB();
	private Logger loggerDB = loggerFactoryDB.createLogger(MyClass.class);
	private LoggerFactory loggerFactoryFile = new LoggerFactoryFile();
	private Logger loggerFile = loggerFactoryFile.createLogger(MyClass.class);
	
	public void init(){
		loggerConsole.info("init.....");
		loggerDB.info("init....");
		loggerFile.info("init....");
		
		loggerConsole.debug("init.....");
		loggerDB.debug("init....");
		loggerFile.debug("init....");
	}
}
