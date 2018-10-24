package dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DaoWarn {

    static Logger logger = LogManager.getLogger();

    public String doSomething() {
        logger.warn("about to execute something on " + this.getClass().getCanonicalName());
        String s = this.toString();
        logger.warn("executed something on " + this.getClass().getCanonicalName());
        return s;
    }
}
