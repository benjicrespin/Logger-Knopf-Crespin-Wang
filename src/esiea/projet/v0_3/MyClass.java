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
		
		
		test = new FileWritting();
		test2 = new RotatingFileWritting();
		
		for (int i = 0; i < 150; i++){
			test.OutputTextPrint("./src/log/log.txt", "test");
			test2.OutputTextPrint("./src/rlog/log.txt", "test");
		}
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
