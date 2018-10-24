package dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DaoTrace {

    static Logger logger = LogManager.getLogger();

    public String doSomething() {
        logger.trace("about to execute something on " + this.getClass().getCanonicalName());
        String s = this.toString();
        logger.trace("executed something on " + this.getClass().getCanonicalName());
        return s;
    }
}
