package service;

import dao.DaoError;
import dao.DaoTrace;
import dao.DaoWarn;
import dao.DaoDebug;
import dao.subpackage.PackagedClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Service {

    static Logger logger = LogManager.getLogger();

    public void execute() {
        logger.info("service started");
        new DaoError().doSomething();
        new DaoWarn().doSomething();
        new DaoDebug().doSomething();
        new DaoTrace().doSomething();
        PackagedClass.f();
        logger.info("service completed");
    }
}
