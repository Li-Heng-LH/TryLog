package me.liheng;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassOne {

    private static final Logger LOGGER = LoggerFactory.getLogger("Hello World");

    public static void log() {
        LOGGER.info("Info from 1");
        LOGGER.debug("Debug from 1");
        LOGGER.error("Error from 1");
    }
}
