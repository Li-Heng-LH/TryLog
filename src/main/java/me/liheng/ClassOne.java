package me.liheng;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassOne {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClassOne.class);

    public static void log() {
        LOGGER.trace("Trace from 1");
        LOGGER.debug("Debug from 1");
        LOGGER.info("Info from 1");
        LOGGER.warn("Warn from 1");
        LOGGER.error("Error from 1");
    }
}
