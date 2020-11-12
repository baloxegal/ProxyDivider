package data;

import java.util.Optional;

import log.LoggerInterface;
import log.ProxyLogger;

public class DivideConsumer {

	private LoggerInterface logger = new ProxyLogger();
			
	public int divide(int number, int divider){
				
		if(divider == 0) {
				
			Optional<String> message = Optional.of("You are dividing on 0");
			
			logger.info(message);
			System.out.println(logger);
						
			return 0;
		}
				
		if(number % divider != 0) {
		
			Optional<String> message = Optional.of("You are missing data, becouse your data type is integer");
			
			logger.info(message);
			System.out.println(logger);
			
		}
		
		return number / divider;
		
	}

}
