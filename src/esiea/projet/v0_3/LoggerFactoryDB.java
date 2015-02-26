package esiea.projet.v0_3;

import java.io.IOException;

public class LoggerFactoryDB implements LoggerFactory {

	@Override
	public Logger createLogger(Class<?> class1){
		// TODO Auto-generated method stub
		return new LoggerDB(class1);
	}

}
