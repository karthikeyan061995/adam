package pro;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Check {

	static Logger log = Logger.getLogger(Check.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("hai");
		log.debug(12*7);
		log.error("Error");
		log.warn("Warning");
		log.fatal("Fatal");

	}

}
