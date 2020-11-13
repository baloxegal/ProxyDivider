package log;

import java.util.Optional;

public class ProxyLogger implements LoggerInterface {

	private static ProxyLogger proxyLoggerSingleton;
	private LoggerInterface logger;
		
	private ProxyLogger() {
	}
		
	@Override
	public void info(Optional<?> message) {
		
		if(logger == null)
			logger = new RealLogger();
		
		logger.info(message);		
		
	}
		
	public static ProxyLogger getProxySingleton() {
		
		if(proxyLoggerSingleton == null) {
			proxyLoggerSingleton = new ProxyLogger();
		}
		
		return proxyLoggerSingleton;
		
	}
	
}
