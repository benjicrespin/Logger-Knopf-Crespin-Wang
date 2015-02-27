package esiea.projet.v0_3;

public class MyClass {
	
	private LoggerFactory loggerFactoryConsole = new LoggerFactoryConsole();
	private Logger loggerConsole = loggerFactoryConsole.createLogger(MyClass.class);
	private LoggerFactory loggerFactoryDB = new LoggerFactoryDB();
	private Logger loggerDB = loggerFactoryDB.createLogger(MyClass.class);
	private LoggerFactory loggerFactoryFile = new LoggerFactoryFile();
	private Logger loggerFile = loggerFactoryFile.createLogger(MyClass.class);
	
	public void init(){
		
		LoadPropertiesInProg prop;
		prop = new LoadPropertiesInProg();
		loggerConsole.setLevel(prop.getLevel());
		loggerDB.setLevel(prop.getLevel());
		loggerFile.setLevel(prop.getLevel());
		
		//loggerConsole.info("init.....");
		//loggerDB.info("init....");
		//loggerFile.info("init....");
		
		//loggerConsole.debug("init.....");
		//loggerDB.debug("init....");
		//loggerFile.debug("init....");
		loggerConsole.showMessage(Level.DEBUG, "init");
		System.out.println("------------------------------------");
		loggerDB.showMessage(Level.INFO, "init");
		System.out.println("------------------------------------");
		loggerFile.showMessage(Level.ERROR, "init");
		System.out.println("------------------------------------");
	}
}
