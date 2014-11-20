/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pricing;

import pricing.RentalFormValidator;
import java.util.ArrayList;
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
public class RentalFormValidatorTest {
    
    private MockRequest mockRequest;
    private RentalFormValidator instance;
    MockRequest currRequest;
    
    public RentalFormValidatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        currRequest = new MockRequest();
        currRequest.setParameter("customerNo", "1111");
        currRequest.setParameter("pickupDay", "1");
        currRequest.setParameter("pickupMonth", "1");
        currRequest.setParameter("pickupYear", "2014");
        currRequest.setParameter("pickupHour", "10");
        currRequest.setParameter("dropoffDay", "1");
        currRequest.setParameter("dropoffMonth", "1");
        currRequest.setParameter("dropoffYear", "2014");
        currRequest.setParameter("dropoffHour", "10");
        currRequest.setParameter("cartype", "standard");
        currRequest.setParameter("cerditCardType", "visa");
        currRequest.setParameter("creditCardNo", "4111111111111111");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isValid method, of class RentalFormValidator.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        RentalFormValidator instance = new RentalFormValidator(null);
        boolean expResult = false;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
    }

    /**
     * Test of getErrors method, of class RentalFormValidator.
     */
    @Test
    public void testGetErrors() {
        System.out.println("getErrors");
        RentalFormValidator instance = new RentalFormValidator(null);
        ArrayList<Integer> expResult = new ArrayList<>();
        expResult.add(1011);
        instance.setErrorCodes(expResult);
        ArrayList<Integer> result = instance.getErrors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setErrorCodes method, of class RentalFormValidator.
     */
    @Test
    public void testSetErrorCodes() {
        System.out.println("setErrorCodes");
        ArrayList<Integer> errorCodes = null;
        RentalFormValidator instance = null;
        //instance.setErrorCodes(errorCodes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public MockRequest getMockRequest() {
        return mockRequest;
    }

    public void setMockRequest(MockRequest mockRequest) {
        this.mockRequest = mockRequest;
    }

    public RentalFormValidator getInstance() {
        return instance;
    }

    public void setInstance(RentalFormValidator instance) {
        this.instance = instance;
    }

    /**
     * Test of isCustomerNull method, of class RentalFormValidator.
     */    @Test
    public void testIsCustomerNull() {
//        if (custNo.isEmpty()) {
//            return false;
//        }
//        try {
//            Integer.valueOf(custNo);
//        } catch (NumberFormatException e) {
//            return false;
//        }
//        return true;
        System.out.println("isCustomerNull");
        RentalFormValidator instance = null;
        //instance.isCustomerNull();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCustomerNumeric method, of class RentalFormValidator.
     */
    @Test
    public void testIsCustomerNumeric() {
        System.out.println("isCustomerNumeric");
        RentalFormValidator instance = null;
        //instance.isCustomerNumeric();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPickupDayNull method, of class RentalFormValidator.
     */
    @Test
    public void testIsPickupDayNull() {
        System.out.println("isPickupDayNull");
        RentalFormValidator instance = null;
        //instance.isPickupDayNull();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPickupDayInRange method, of class RentalFormValidator.
     */
    @Test
    public void testIsPickupDayInRange() {
        System.out.println("isPickupDayInRange");
        RentalFormValidator instance = null;
        //instance.isPickupDayInRange();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
