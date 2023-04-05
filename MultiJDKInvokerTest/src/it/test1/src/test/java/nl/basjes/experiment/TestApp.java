package nl.basjes.experiment;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TestApp {

    @Test
    void testSomething() {
        assertEquals("Hello", new App().doSomething());
    }

    @Test
    void logProperties() {
        Logger logger = LoggerFactory.getLogger("Properties");
        List<String> allKeyNames = System.getProperties().keySet().stream().map(Object::toString).sorted().collect(Collectors.toList());

        int maxKeyLen = allKeyNames.stream().mapToInt(String::length).max().orElse(0);
        for (Object key : allKeyNames) {
            String keyName = key.toString();
            logger.info("{}", String.format("%-" + maxKeyLen + "s ==> %s", keyName, System.getProperties().getProperty(key.toString())));
        }
    }

    @Test
    void testVersion() {
        System.out.println("Java version during testing (code = "+Version.getCodeVersion()+"): " + Version.getJavaVersion());
        String integrationTestingJDK= System.getProperty("integrationTestingJDK");
        assertNotNull(integrationTestingJDK, "Property integrationTestingJDK was not set");
        assertEquals(integrationTestingJDK, Version.getJavaMajorVersion(), "Wrong major Java version was used");
    }

}
