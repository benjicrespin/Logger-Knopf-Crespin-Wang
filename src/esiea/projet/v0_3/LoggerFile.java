package esiea.projet.v0_3;

public class LoggerFile extends Logger {

	FileWritting writting;
	LoadPropertiesInProg prop;
	
	public LoggerFile(Class<?> class1) {
		super(class1);
		writting = new FileWritting();
		prop = new LoadPropertiesInProg();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void debug(String message) {
		// TODO Auto-generated method stub
		//System.out.println("File writing[FOR TEST ONLY]:");
		setMessage(message);
		writting.OutputTextPrint(prop.getTargets().get(0), useFormator());
		//setLevel(Level.DEBUG);
		setDate();
		System.out.println(useFormator());
	}

	@Override
	public void info(String message) {
		// TODO Auto-generated method stub
		//System.out.println("File writing[FOR TEST ONLY]:");
		setMessage(message);
		writting.OutputTextPrint(prop.getTargets().get(0), useFormator());
		//setLevel(Level.INFO);
		setDate();
		System.out.println(useFormator());
	}

	@Override
	public void error(String message) {
		// TODO Auto-generated method stub
		//System.out.println("File writing[FOR TEST ONLY]:");
		setMessage(message);
		writting.OutputTextPrint(prop.getTargets().get(0), useFormator());
		//setLevel(Level.ERROR);
		setDate();
		System.out.println(useFormator());
	}

}
