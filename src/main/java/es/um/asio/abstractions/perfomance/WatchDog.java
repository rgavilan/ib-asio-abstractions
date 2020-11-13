package es.um.asio.abstractions.perfomance;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;

public class WatchDog {
		
	private long start;
	
	private List<String> watchLog; 
		
	public WatchDog() {
		watchLog = new ArrayList<>();
		reset();
	}
	
	public void reset() {
		this.start = System.currentTimeMillis();
	}
		
	/**
	 * Take time.
	 *
	 * @param methodName the method name
	 */
	public void takeTime(String methodName) {
		long end = System.currentTimeMillis();
		long time = end - start;
		start = end;
		
		StringBuilder str = new StringBuilder();
		str.append("WATCHDOG method ");
		str.append(methodName);
		str.append(" duration: ");
		str.append(time);
		str.append(" miliseconds");
		
		watchLog.add(str.toString());
	}
	
	/**
	 * Printn results.
	 *
	 * @param logger the logger
	 */
	public void printnResults(Logger logger) {
		for(String entry: watchLog) {
			logger.warn(entry);
		}
	}
	
}
