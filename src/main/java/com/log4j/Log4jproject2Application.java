package com.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4jproject2Application {
	static Logger log=Logger.getLogger(Log4jproject2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Log4jproject2Application.class, args);
		
		//BasicConfigurator.configure();
		PropertyConfigurator.configure("dhana.properties");
		log.info("Information");
		log.error("Error");
		log.debug("Debugging");
		log.fatal("Critical Error");
		log.warn("Warning");
	}
	

}
