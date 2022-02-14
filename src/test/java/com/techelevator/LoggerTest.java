package com.techelevator;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;

public class LoggerTest extends TestCase {

    public void testGetDateFormat() {

    }

    public void testGetText() {
        Logger logger = new Logger();
        String text = "Any Text Here";
        assertEquals("Any Text Here", logger.getText(text));
    }

    public void testGetDateTime() {
        Logger logger = new Logger();
        assertEquals(logger.getDateTime(), logger.getDateTime());
    }

    public void testLogToFile() {
    }
}