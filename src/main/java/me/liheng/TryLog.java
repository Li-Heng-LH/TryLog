package me.liheng;

import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TryLog {

    private static final Logger logger = LoggerFactory.getLogger(TryLog.class);
    private static final org.apache.logging.log4j.Logger log4jLogger = LogManager.getLogger(TryLog.class);

    public static void main(String[] args) throws InterruptedException {
        testLog4j();
    }

    private static void testRollingFileAppender() throws InterruptedException {
        for(int i = 0; i < 2000; i++) {
            logger.info("This is the " + i + " time I say 'Hello World'.");
            Thread.sleep(70);
        }
    }

    private static void testLog4j() {
        logger.info("This is from SLF4J logger");
        log4jLogger.info("This is from LOG4J logger");
        logger.info("This is from SLF4J logger");
        log4jLogger.info("This is from LOG4J logger");
    }
}
