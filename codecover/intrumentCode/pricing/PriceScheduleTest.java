/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pricing;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jhlee
 */
public class PriceScheduleTest {
    
    public PriceScheduleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTypeName method, of class PriceSchedule.
     */
    @Test
    public void testGetTypeName() {
        System.out.println("getTypeName");
        PriceSchedule instance = new PriceSchedule();
        String expResult = "";
        String result = instance.getTypeName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTypeName method, of class PriceSchedule.
     */
    @Test
    public void testSetTypeName() {
        System.out.println("setTypeName");
        String typeName = "";
        PriceSchedule instance = new PriceSchedule();
        instance.setTypeName(typeName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeekdayRate method, of class PriceSchedule.
     */
    @Test
    public void testGetWeekdayRate() {
        System.out.println("getWeekdayRate");
        PriceSchedule instance = new PriceSchedule();
        BigDecimal expResult = null;
        BigDecimal result = instance.getWeekdayRate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWeekdayRate method, of class PriceSchedule.
     */
    @Test
    public void testSetWeekdayRate() {
        System.out.println("setWeekdayRate");
        BigDecimal weekdayRate = null;
        PriceSchedule instance = new PriceSchedule();
        instance.setWeekdayRate(weekdayRate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeekendRate method, of class PriceSchedule.
     */
    @Test
    public void testGetWeekendRate() {
        System.out.println("getWeekendRate");
        PriceSchedule instance = new PriceSchedule();
        BigDecimal expResult = null;
        BigDecimal result = instance.getWeekendRate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWeekendRate method, of class PriceSchedule.
     */
    @Test
    public void testSetWeekendRate() {
        System.out.println("setWeekendRate");
        BigDecimal weekendRate = null;
        PriceSchedule instance = new PriceSchedule();
        instance.setWeekendRate(weekendRate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeeklyRate method, of class PriceSchedule.
     */
    @Test
    public void testGetWeeklyRate() {
        System.out.println("getWeeklyRate");
        PriceSchedule instance = new PriceSchedule();
        BigDecimal expResult = null;
        BigDecimal result = instance.getWeeklyRate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWeeklyRate method, of class PriceSchedule.
     */
    @Test
    public void testSetWeeklyRate() {
        System.out.println("setWeeklyRate");
        BigDecimal weeklyRate = null;
        PriceSchedule instance = new PriceSchedule();
        instance.setWeeklyRate(weeklyRate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PriceSchedule.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PriceSchedule instance = new PriceSchedule();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
