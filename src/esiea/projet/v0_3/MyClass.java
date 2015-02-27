package esiea.projet.v0_3;

public class MyClass {
	
	private LoggerFactory loggerFactoryConsole = new LoggerFactoryConsole();
	private Logger loggerConsole = loggerFactoryConsole.createLogger(MyClass.class);
	private LoggerFactory loggerFactoryDB = new LoggerFactoryDB();
	private Logger loggerDB = loggerFactoryDB.createLogger(MyClass.class);
	private LoggerFactory loggerFactoryFile = new LoggerFactoryFile();
	private Logger loggerFile = loggerFactoryFile.createLogger(MyClass.class);
	
	FileWritting test;
	RotatingFileWritting test2;
	
	public MyClass() {
		
	}
	
	public void init(){
		
		LoadPropertiesInProg prop;
		prop = new LoadPropertiesInProg();
		
		if (prop.getConsole().compareTo("true") == 0){
			loggerConsole.setLevel(prop.getLevel());
			
		}
		if (!prop.getTarget2().isEmpty()){
			loggerFile.setLevel(prop.getLevel());
			
		}
		if (!prop.getTarget3().isEmpty()){
			loggerFile.setLevel(prop.getLevel());
			
		}
		
		loggerConsole.info("testing.....");
		//loggerDB.info("testing....");
		loggerFile.info("testing....");
		
		loggerConsole.debug("init.....");
		//loggerDB.debug("init....");
		loggerFile.debug("init....");
		
		System.out.println();
		
		loggerConsole.showMessage(Level.DEBUG, "init");
		System.out.println("------------------------------------");
		loggerDB.showMessage(Level.INFO, "init");
		System.out.println("------------------------------------");
		loggerFile.showMessage(Level.ERROR, "init");
		System.out.println("------------------------------------");
	}
}
