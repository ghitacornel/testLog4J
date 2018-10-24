package main;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configuration;
import service.Service;


public class Main {

    public void main() {

        // configure loggers

        LoggerContext loggerContext = (LoggerContext) LogManager.getContext(false);
        Configuration configuration = loggerContext.getConfiguration();

        configuration.getLoggerConfig("dao").addAppender(configuration.getAppender("daoError"), Level.ERROR, null);
//        configuration.getLoggerConfig("dao").removeAppender("dao");
        configuration.getLoggerConfig("service").removeAppender("service");


        loggerContext.updateLoggers();

        // move on

        new Service().execute();
    }
}
