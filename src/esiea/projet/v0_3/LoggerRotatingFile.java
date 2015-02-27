package esiea.projet.v0_3;

public class LoggerRotatingFile extends Logger {

	RotatingFileWritting writting;
	LoadPropertiesInProg prop;
	
	public LoggerRotatingFile(Class<?> class1) {
		super(class1);
		writting = new RotatingFileWritting();
		prop = new LoadPropertiesInProg();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void debug(String message) {
		// TODO Auto-generated method stub
		//System.out.println("File writing[FOR TEST ONLY]:");
		setMessage(message);
		writting.OutputTextPrint(prop.getTargets().get(3), message);
		//setLevel(Level.DEBUG);
		setDate();
		System.out.println(toString());
	}

	@Override
	public void info(String message) {
		// TODO Auto-generated method stub
		//System.out.println("File writing[FOR TEST ONLY]:");
		setMessage(message);
		writting.OutputTextPrint(prop.getTargets().get(3), message);
		//setLevel(Level.INFO);
		setDate();
		System.out.println(toString());
	}

	@Override
	public void error(String message) {
		// TODO Auto-generated method stub
		//System.out.println("File writing[FOR TEST ONLY]:");
		setMessage(message);
		writting.OutputTextPrint(prop.getTargets().get(3), message);
		//setLevel(Level.ERROR);
		setDate();
		System.out.println(toString());
	}

}
