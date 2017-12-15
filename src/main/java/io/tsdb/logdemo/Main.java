package io.tsdb.logdemo;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jcreasy on 12/15/17.
 */

public class Main {
    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        Main obj = new Main();
        MDC.put("transaction.id", "0x049FFA");
        MDC.put("transaction.owner", "jcreasy");
        obj.runMe("running");
    }

    private void runMe(String parameter) {

        if (logger.isDebugEnabled()) {
            logger.debug("This is debug : " + parameter);
        }

        if (logger.isInfoEnabled()) {
            logger.info("This is info : " + parameter);
        }

        logger.warn("This is warn : " + parameter);
        logger.error("This is error : " + parameter);
        logger.fatal("This is fatal : " + parameter);

    }
}
