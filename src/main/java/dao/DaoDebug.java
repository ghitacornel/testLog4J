package dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DaoDebug {

    static Logger logger = LogManager.getLogger();

    public String doSomething() {
        logger.debug("about to execute something on " + this.getClass().getCanonicalName());
        String s = this.toString();
        logger.debug("executed something on " + this.getClass().getCanonicalName());
        return s;
    }
}
