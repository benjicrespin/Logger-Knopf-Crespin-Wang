package esiea.projet.v0_3;

public class LoggerFactoryConsole implements LoggerFactory {

	@Override
	public Logger createLogger(Class<?> class1) {
		// TODO Auto-generated method stub
		
		return new LoggerConsole(class1); 
	}
}
