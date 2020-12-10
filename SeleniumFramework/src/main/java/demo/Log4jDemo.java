package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	static Logger logger = LogManager.getLogger(Log4jDemo.class);
	public static void main(String[] args) {
		System.out.println("Hello World!.\n");
		logger.trace("This is an Trace message");
		logger.info("This is an information message");
		logger.error("This is an error message");
		logger.warn("This is an warning message");
		logger.fatal("This is an fatal message");
		System.out.println("\n Completed.");
		
	}

}
