package ru.spoddubniak.jdbc.log4j.levelOne;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Class demonstrates the use of log4j for logging.
 *
 * @author Sergei Poddubniak (forvvard09@gmail.com)
 * @version 1.0
 * @since 23.01.2019
 */
public class UsageLog4j2 {
    /**
     * static value for to store a logger object.
     */
    private static final Logger LOG = LogManager.getLogger(UsageLog4j2.class.getName());

    /**
     * Method print result logging prints logging results depending on logging level.
     *
     * @param args - args.
     */
    public static void main(String[] args) {
        LOG.trace("trace message");
        LOG.debug("debug message");
        LOG.info("info message");
        LOG.warn("warn message");
        LOG.error("error message");
    }
}
