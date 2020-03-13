package me.liheng;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TryLog {

    private static Logger LOGGER = LoggerFactory.getLogger(TryLog.class);

    public static void main(String[] args) {
        LOGGER.info("Info World");
        LOGGER.debug("Debug World");
        LOGGER.error("Error World");
    }
}
