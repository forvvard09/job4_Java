package ru.spoddubniak.jdbc.log4j.levelTwo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class demonstrates the use of log4j for logging.
 *
 * @author Sergei Poddubniak (forvvard09@gmail.com)
 * @version 1.0
 * @since 23.01.2019
 */
public class ExJob {
    /**
     * static value for to store a logger object.
     */
    private static final Logger LOG = LogManager.getLogger(ExJob.class.getName());

    /**
     * Method print result logging prints logging results depending on logging level.
     *
     * @param args - args.
     */
    public static void main(String[] args) {
        int version = 1;
        LOG.trace("trace message {}", version);
        LOG.debug("trace message {}", version);
        LOG.info("trace message {}", version);
        LOG.warn("trace message {}", version);
        LOG.error("trace message {}", version);
    }
}
