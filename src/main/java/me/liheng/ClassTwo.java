package me.liheng;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassTwo {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClassTwo.class);

    public static void log() {
        LOGGER.info("Info from 2");
        LOGGER.debug("Debug from 2");
        LOGGER.error("Error from 2");
    }
}
