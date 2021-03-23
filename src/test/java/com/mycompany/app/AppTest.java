package com.mycompany.app;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;
import com.mycompany.app.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }


    @Test
    public void testAppMain() throws Exception {
        App.main(null);
        try {
            assertEquals(1.2, new Coffee().getPrice(), 1.2);
            assertEquals(1.5, new Coffee().getPrice(), 1.5);
        } catch (AssertionError e) {
            fail("\"message\" is not \"Coffee: dark - Price: 1.2\"");
        }
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}
