package me.liheng;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TryLog {

    private static final Logger logger = LoggerFactory.getLogger(TryLog.class);

    public static void main(String[] args) throws InterruptedException {

        for(int i = 0; i < 20; i++) {
            logger.info("This is the " + i + " time I say 'Hello World'.");
//            Thread.sleep(70);
        }
    }
}
