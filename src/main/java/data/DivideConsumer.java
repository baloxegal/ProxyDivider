package data;

import java.util.Optional;

import log.LoggerInterface;
import log.ProxyLogger;

public class DivideConsumer {

	private static DivideConsumer divSingleton;
	private LoggerInterface logger;
	
	private DivideConsumer() {
		this.logger = ProxyLogger.getProxySingleton();
	}
		
	public int divide(int number, int divider){
				
		if(divider == 0) {
				
			Optional<String> message = Optional.of("You are dividing on 0");
			
			logger.info(message);
						
			return 0;
		}
				
		if(number % divider != 0) {
		
			Optional<String> message = Optional.of("You are missing data, becouse your data type is integer");
			
			logger.info(message);
			
		}
		
		return number / divider;
		
	}
	
	public static DivideConsumer getDivConsSingle() {
		
		if(divSingleton == null) {
			
			divSingleton = new DivideConsumer();
		}
		
		return divSingleton;
	}

}
