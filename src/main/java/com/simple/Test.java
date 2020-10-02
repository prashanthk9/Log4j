package com.simple;


import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Test {

	private static Logger log= Logger.getLogger(Test.class);

	public static void main(String args[]){

		//create layout
		//Layout layout=new HTMLLayout();
		//Layout layout=new SimpleLayout();

		//Layout layout=new XMLLayout();
		Layout layout=new PatternLayout("%d %c %M %m %n");
		//2. create appender + link layout

		Appender app=new ConsoleAppender(layout);

		//3. link appender with logger

		log.addAppender(app);

		//---print Messages----

		log.info("FROM INFO");
		log.debug("FROM DEBUG");
		log.fatal("FROM FATAL");
		log.error("FROM ERROR");
		log.warn("FROM WARN");


	}

}
