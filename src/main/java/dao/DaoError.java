package dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DaoError {

    static Logger logger = LogManager.getLogger();

    public String doSomething() {
        logger.error("about to execute something on " + this.getClass().getCanonicalName());
        String s = this.toString();
        logger.error("executed something on " + this.getClass().getCanonicalName());
        return s;
    }
}
