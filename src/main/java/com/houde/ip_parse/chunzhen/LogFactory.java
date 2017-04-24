package com.houde.ip_parse.chunzhen;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * Created by Administrator on 2017/4/20 0020.
 */
public class LogFactory {
    private static final Logger logger;
    static {
        logger = Logger.getLogger("stdout");
        logger.setLevel(Level.DEBUG);
    }

    public static void log(String info, Level level, Throwable ex) {
        logger.log(level, info, ex);
    }

    public static Level  getLogLevel(){
        return logger.getLevel();
    }
}
