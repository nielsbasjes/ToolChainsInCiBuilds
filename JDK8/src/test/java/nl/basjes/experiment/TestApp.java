package nl.basjes.experiment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestApp {

    @Test
    void testSomething() {
        assertEquals("Hello", new App().doSomething());
    }

}
