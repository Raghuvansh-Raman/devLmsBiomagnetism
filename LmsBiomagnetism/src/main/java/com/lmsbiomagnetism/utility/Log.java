package com.lmsbiomagnetism.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
    // Initialize Log4j logs
    private static final Logger logger = LogManager.getLogger(Log.class);

    public static void startTestCase(String sTestCaseName) {
        logger.info("=====================================" + sTestCaseName + " TEST START=========================================");
    }

    public static void endTestCase(String sTestCaseName) {
        logger.info("=====================================" + sTestCaseName + " TEST END=========================================");
    }

    // Below methods can be called to log at different levels
    public static void info(String message) {
        logger.info(message);
    }

    public static void warn(String message) {
        logger.warn(message);
    }

    public static void error(String message) {
        logger.error(message);
    }

    public static void fatal(String message) {
        logger.fatal(message);
    }

    public static void debug(String message) {
        logger.debug(message);
    }
}
