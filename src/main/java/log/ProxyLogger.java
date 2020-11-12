package log;

import java.util.Optional;

public class ProxyLogger implements LoggerInterface {

	private LoggerInterface logger;
		
	@Override
	public void info(Optional<?> message) {
		
		if(logger == null)
			logger = new RealLogger();
		
		System.out.println(logger);
		logger.info(message);		
		
	}
		
}
