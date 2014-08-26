package com.tw.java.basic;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Practice10_Log4j {

    public void log() {
        Logger logger = Logger.getLogger(Practice10_Log4j.class);
        PropertyConfigurator.configure("/Users/jtao/Documents/Code/java/practice/src/main/resource/log4j.properties");
        logger.debug("Debug info");
        logger.info("Info info");
        logger.warn("Warn info");
        logger.error("Error info");
        logger.fatal("Fatal info");
    }

    public static void main(String[] args){

        Practice10_Log4j test = new Practice10_Log4j();
        test.log();
    }


}
