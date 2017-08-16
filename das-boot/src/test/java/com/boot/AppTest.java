package com.boot;

import com.boot.controller.HomeController;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigourous Test :-)
     */
    @org.junit.Test
    public void testApp()
    {
        HomeController homeController = new HomeController();
        String result = homeController.home();
        assertEquals(result, "Das Boot, reporting for duty!");
    }
}
