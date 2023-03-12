package nl.basjes.experiment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOG = LoggerFactory.getLogger("App (java 17 version)");
    public String doSomething() {
        LOG.info("Doing the java 17 version");
        return "Hello";
    }
}
