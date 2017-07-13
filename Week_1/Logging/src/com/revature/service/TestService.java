package com.revature.service;

import org.apache.log4j.Logger;

public class TestService {
	
	private static Logger log = Logger.getRootLogger();
	
	public void someMethod(){
		
		log.trace("Trace msg");
		log.debug("Debug msg");
		log.info("Info msg");
		log.warn("Warn msg");
		log.error("Error msg");
		log.fatal("Fatal msg");
		
	}

}
