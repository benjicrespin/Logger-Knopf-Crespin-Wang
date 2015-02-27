package esiea.projet.v0_3;

public class MyClass {
	
	private LoggerFactory loggerFactoryConsole = new LoggerFactoryConsole();
	private Logger loggerConsole = loggerFactoryConsole.createLogger(MyClass.class);
	private LoggerFactory loggerFactoryDB = new LoggerFactoryDB();
	private Logger loggerDB = loggerFactoryDB.createLogger(MyClass.class);
	private LoggerFactory loggerFactoryFile = new LoggerFactoryFile();
	private Logger loggerFile = loggerFactoryFile.createLogger(MyClass.class);
	private LoggerFactory rotatingLoggerFactoryFile = new LoggerFactoryRotatingFile();
	private Logger loggerRotatingFile = rotatingLoggerFactoryFile.createLogger(MyClass.class);
	
	LoadPropertiesInProg prop;
	
	
	public MyClass() {
		prop = new LoadPropertiesInProg();
	}
	
	public void init(){
		
		
		
		loggerConsole.setLevel(prop.getLevel());
		loggerFile.setLevel(prop.getLevel());
		loggerRotatingFile.setLevel(prop.getLevel());
		
		loggerConsole.setFormator(prop.getFormator());
		loggerFile.setFormator(prop.getFormator());
		loggerRotatingFile.setFormator(prop.getFormator());
		
		loggerConsole.info("testing1.....");
		loggerFile.info("testing2....");
		loggerRotatingFile.info("testing3");
		
		loggerConsole.debug("testing4.....");
		loggerFile.debug("testing5....");
		loggerRotatingFile.debug("testing6");
		
		System.out.println();
		
		/*loggerConsole.showMessage(Level.DEBUG, "init");
		System.out.println("------------------------------------");
		loggerFile.showMessage(Level.ERROR, "init");
		System.out.println("------------------------------------");*/
	}
	
	public void useLogger(Level level, String message)
	{
		if (prop.getConsole().compareTo("true") == 0){
			switch(level){
				case DEBUG:
					loggerConsole.debug(message);
					break;
				case INFO:
					loggerConsole.info(message);
					break;
				case ERROR:
					loggerConsole.error(message);
					break;
				default:
					break;
			}
		}
		
		for (String target : prop.getTargets()){
			if (target.contains("rot") == true){
				switch(level){
				case DEBUG:
					loggerRotatingFile.debug(message);
					break;
				case INFO:
					loggerRotatingFile.info(message);
					break;
				case ERROR:
					loggerRotatingFile.error(message);
					break;
				default:
					break;
			}
			}
			else if (!target.isEmpty()){
				switch(level){
				case DEBUG:
					loggerFile.debug(message);
					break;
				case INFO:
					loggerFile.info(message);
					break;
				case ERROR:
					loggerFile.error(message);
					break;
				default:
					break;
			}
			}
		}
	}
}
