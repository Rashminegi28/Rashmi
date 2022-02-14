package com.techelevator;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoggerTest extends TestCase {


    @Test
    public void testGetText() {
        Logger logger = new Logger();
        String text = "Any Text Here";
        assertEquals("Any Text Here", logger.getText(text));
    }
    @Test
    public void testGetDateTime() {
        Logger logger = new Logger();
        assertEquals(logger.getDateTime(), logger.getDateTime());
    }
    @Test
    public void testLogToFile() {
    }
    
}