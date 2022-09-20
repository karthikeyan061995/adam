package pro;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Click {
	
	static Logger log = Logger.getLogger(Click.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("Checking.info");
		log.info("Hello");
		log.debug(12*7);
		log.error("Error");
		log.warn("Warning");
		log.fatal("Fatal");

		
	
}

}