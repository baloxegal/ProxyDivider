package log;

import java.util.Optional;

public class RealLogger implements LoggerInterface {
	
	RealLogger() {		
	}
	
	@Override
	public void info(Optional<?> message) {
		
		System.out.println("*********************");
		System.out.println(message);
		System.out.println("*********************");
		
	}
	
}
