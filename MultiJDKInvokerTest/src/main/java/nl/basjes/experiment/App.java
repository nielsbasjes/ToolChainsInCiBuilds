package nl.basjes.experiment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOG = LoggerFactory.getLogger("App (base version)");
    public String doSomething() {
        LOG.info("Doing the base version");
        return "Hello";
    }
}
