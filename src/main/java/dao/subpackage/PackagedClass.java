package dao.subpackage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PackagedClass {

    static Logger logger = LogManager.getLogger();

    static {
        logger.info("inner static stuff");
    }

    public static void f(){
        logger.info("inner stuff");
    }
}
