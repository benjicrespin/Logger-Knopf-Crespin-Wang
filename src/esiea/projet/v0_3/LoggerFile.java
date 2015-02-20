package esiea.projet.v0_3;

public class LoggerFile extends Logger {

	public LoggerFile(Class<?> class1) {
		super(class1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void debug(String message) {
		// TODO Auto-generated method stub
		System.out.println("File writing[FOR TEST ONLY]:");
		setMessage(message);
		setLevel(Level.DEBUG);
		setDate();
		System.out.println(toString());
	}

	@Override
	public void info(String message) {
		// TODO Auto-generated method stub
		System.out.println("File writing[FOR TEST ONLY]:");
		setMessage(message);
		setLevel(Level.INFO);
		setDate();
		System.out.println(toString());
	}

	@Override
	public void error(String message) {
		// TODO Auto-generated method stub
		System.out.println("File writing[FOR TEST ONLY]:");
		setMessage(message);
		setLevel(Level.ERROR);
		setDate();
		System.out.println(toString());
	}

}
